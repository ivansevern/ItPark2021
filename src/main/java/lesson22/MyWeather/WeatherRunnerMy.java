package lesson22.MyWeather;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson22.MyWeather.dto.WeatherDto;
import lesson22.MyWeather.exception.MandatoryParameterSkippedException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

//846cae20cf32ee6c4f3c1e7f1bb55b53
//api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
//https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric
//-DappId=846cae20cf32ee6c4f3c1e7f1bb55b53 -DtestParam=test
public class WeatherRunnerMy {

    private static final ResourceBundle RESOURCES = ResourceBundle.getBundle("messages");
    private static final String APP_CLOSE = RESOURCES.getString("app.close");
    private static final String EXIT_PHRASE = RESOURCES.getString("app.exit");
    private static final String APP_ID = "appId";
    private static final String API_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) throws IOException {
        final String appId = Optional.ofNullable(System.getProperty(APP_ID))
                .orElseThrow(() -> new MandatoryParameterSkippedException(RESOURCES.getString("app.errorParameter")));
        Scanner inpuScanner = new Scanner(System.in);
        System.out.println(RESOURCES.getString("app.title"));
        ObjectMapper objectMapper = new ObjectMapper();
        while (inpuScanner.hasNextLine()) {
            String city = inpuScanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(city)) {
                System.out.println(RESOURCES.getString("app.close"));
                return;
            }

            String transformedCityName = getCityEr(city);
            URL apiUrl = new URL(String.format(API_WEATHER_URL, transformedCityName, appId));
            try (InputStream is = apiUrl.openStream()) {
                WeatherDto weatherDto = objectMapper.readValue(is, WeatherDto.class);
                System.out.printf(RESOURCES.getString("app.result"),
                        city, weatherDto.getMain().getTemp(),
                        weatherDto.getMain().getPressure(),
                        weatherDto.getWind().getSpeed(), weatherDto.getWind().getDeg(),
                        weatherDto.getClouds().getAll(),
                        weatherDto.getSys().getCountry()
                );
            }
            System.out.println(RESOURCES.getString("app.nextPhrase"));
        }
    }

    private static String getCityEr(String city) {
        try {
            return RESOURCES.getString(city);
        } catch (Exception e) {
            return city;
        }
    }
}
