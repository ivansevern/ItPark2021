package lesson22;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class WeatherRunner1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city");
        String city = scanner.nextLine();
        URL url = JsonFormat.createUrl("http://api.openweathermap.org/data/2.5/find?q="
                + city + "&appid=846cae20cf32ee6c4f3c1e7f1bb55b53&units=metric");
        String resultJson = JsonFormat.parseUrl(url);
        System.out.println("\nПолученный JSON:\n" + resultJson);
        String json = JsonFormat.buildWeatherJson();
        System.out.println("\nСозданный нами JSON:\n" + json);

    }
}