package lesson22;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonFormat {
    public static String parseUrl(URL url) {
        if (url == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void parseCurrentWeatherJson(String resultJson) {
        JSONObject weatherJsonObject = new JSONObject(resultJson);
        System.out.println("Название: " + weatherJsonObject.get("name"));
        JSONArray weatherArray = (JSONArray) weatherJsonObject.get("weather");
        JSONObject weatherData = (JSONObject) weatherArray.get(0);
        System.out.println("Погода на данный момент: " + weatherData.get("main"));
        System.out.println("Более детальное описание погоды: " + weatherData.get("description"));
    }

    public static String buildWeatherJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("weather_id", 0);
        jsonObject.put("name", "city"); //как подставить значение города из раннера
        jsonObject.accumulate("name", "");
        jsonObject.append("name", "");
        jsonObject.increment("weather_id");
        jsonObject.put("main", "Солнечно");
        jsonObject.put("description", "Мороз трескучий, На небе ни единой тучи");
        System.out.println(JSONObject.quote(jsonObject.toString()));
        return jsonObject.toString();
    }

    public static String convertJsonToCsv(String jsonString) {
        JSONObject jsonObject = new JSONObject(jsonString);
        return CDL.toString(jsonObject.getJSONArray("weather"));
    }

    public static URL createUrl(String link) {
        try {
            return new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}