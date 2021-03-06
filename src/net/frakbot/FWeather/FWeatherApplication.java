/*
 * Copyright 2013 Sebastiano Poggi and Francesco Pontillo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.frakbot.FWeather;

import android.app.Application;
import net.frakbot.FWeather.util.FLog;

/**
 * Application handler
 * <p/>
 * Author: Sebastiano Poggi
 * Created on: 6/30/13 Time: 7:30 PM
 * File version: 1.0
 * <p/>
 * Changelog:
 * Version 1.0
 * * Initial revision
 */
public class FWeatherApplication extends Application {

    private static String mApiKey;

    @Override
    public void onCreate() {
        FLog.recheckLogLevels();
        FLog.i(null, "App starting...");

        super.onCreate();

        // This will fail if you didn't define your own API key string!
        mApiKey = getString(R.string.weather_api_key);
    }

    /**
     * Returns the OpenWeatherMap API key.
     *
     * @return Returns the OpenWeatherMap API key
     */
    public static String getApiKey() {
        return mApiKey;
    }
}
