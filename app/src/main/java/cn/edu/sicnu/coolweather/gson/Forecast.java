package cn.edu.sicnu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HYM on 2018/5/10 0010.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("hum")
    public String  hum;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
