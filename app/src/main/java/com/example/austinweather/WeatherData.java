package com.example.austinweather;

import java.util.List;

/** https://openweathermap.org/api/one-call-api#list1
 * Current weather
 * Minute forecast for 1 hour
 * Hourly forecast for 48 hours
 * Daily forecast for 7 days
 * National weather alerts
 * Historical weather data for the previous 5 days
 * **/

public class WeatherData {

    private String timezone;
    private WeatherState current;
    private List<WeatherState> hourly;
    private List<DailyWeather> daily;

    private class WeatherInfo{
        private Integer id;
        private String main;
        private String description;
        private String icon;
    }

    private class DailyWeather{
        DayTemp temp;
        List<WeatherInfo> weather;

        private class DayTemp{
            private Double day;
            private Double min;
            private Double max;
        }
    }
    private class WeatherState{
        private Integer dt;
        private Double temp;
        private Integer pressure;
        private Integer humidity;
        private Double wind_speed;
        private List<WeatherInfo> weather;
    }

    @Override
    public String toString(){
        return "TESTING ONLY\ntimezone: " + timezone +"\ntemperature: " + current.temp + "\npressure: " + current.pressure +"\nhumidity: " + current.humidity
                + "\nweatherState: " + current.weather.get(0).main + "\nweatherDescription: " + current.weather.get(0).description
                + "\n hourly first: " + hourly.get(0).temp + "\n daily test: " + daily.get(0).weather.get(0).main;
    }
}