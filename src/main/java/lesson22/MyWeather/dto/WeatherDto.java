package lesson22.MyWeather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {

    @JsonProperty("main")
    private MainDto main;

    @JsonProperty("wind")
    private WindDto wind;

    @JsonProperty("clouds")
    private CloudsDto clouds;

    @JsonProperty("sys")
    private SysDto sys;

    @JsonProperty("deg")
    private SysDto deg;


    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MainDto {
        private Double temp;
        private Integer pressure;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WindDto {
        private Double speed;
        private String deg;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CloudsDto {
        private String all;

    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SysDto {
        private String country;
    }


}
