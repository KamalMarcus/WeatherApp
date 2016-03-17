package app.com.example.weatherapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by Gamer on 5/14/2015.
 */
public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject weather=new JSONObject(weatherJsonStr);
        JSONArray days=weather.getJSONArray("list");
        JSONObject dayInfo=days.getJSONObject(dayIndex);
        JSONObject tempratureInfo=dayInfo.getJSONObject("temp");
        return tempratureInfo.getDouble("max");

    }
}
