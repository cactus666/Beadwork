package com.cactusFromHell.beadwork;

import android.app.Application;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder("").build();
//        YandexMetrica.activate(getApplicationContext(), config);
//        YandexMetrica.enableActivityAutoTracking(this);
    }
}
