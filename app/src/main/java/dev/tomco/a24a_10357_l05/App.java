package dev.tomco.a24a_10357_l05;

import android.app.Application;

import dev.tomco.a24a_10357_l05.Utilities.SharedPreferencesManagerV3;
import dev.tomco.a24a_10357_l05.Utilities.SignalManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferencesManagerV3.init(this);
        SignalManager.init(this);
    }
}
