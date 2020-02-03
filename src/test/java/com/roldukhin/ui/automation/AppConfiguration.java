package com.roldukhin.ui.automation;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class AppConfiguration {

    private final Config appConfig;

    public AppConfiguration() {
        Config config = ConfigFactory.parseResources("config/app.conf").resolve();
        if (config.getConfig("app") == null) {
            throw new IllegalArgumentException("Internal Test Config file wasn't found, please check the file");
        }

        appConfig = config.getConfig("app");
    }

    public String getEntryPoint() {
        return appConfig.getString("entry.url");
    }

}
