package lesson22;

/*
1. Изучить стороннее API. В качестве примера можно взять https://api.openweathermap.org/ ;

2. Разработать консольное приложение, где пользователь передает информацию и получает ответ от удаленного сервиса.
Например, при использовании погодного сервиса ожидается, что пользователь будет вводить название городов,
информацию о погоде которых он захочет получить.
Для получения требуемых данных в программе потребуется подключиться к данному API,
используя возможности URLConnection или любого понравившегося Http клиента.
Запрос данных о погоде осуществляется посредством обращения по адресу:
https://api.openweathermap.org/data/2.5/weather?q=Samara&appid=<api_key>&units=metric.
Используя параметр mode можно выбрать подходящий формат (json/xml),
в качестве параметра appid следует передать API Key пользователя,
которого следует зарегистрировать (либо использовать 886705b4c1182eb1c69f28eb8c520e20 – не рекомендуется).

3*. API Key следует вынести во внешний ресурсный файл или использовать как переменные окружения/системные свойства

4*. Для транслитерации текста рекомендую воспользоваться библиотекой icu4j или справочник городов
*/

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ShowWeatherRunner2 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city");
        String city = scanner.nextLine();
        URI uri = new URI("http://api.openweathermap.org/data/2.5/find?q="+city+"&appid=846cae20cf32ee6c4f3c1e7f1bb55b53&units=metric");
        System.out.println("Host " + uri.getHost());
        System.out.println("Param " + uri.getRawQuery());
        System.out.println("------------");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        Scanner scanner2 = new Scanner(url.openStream());
        while(scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
    }
}
