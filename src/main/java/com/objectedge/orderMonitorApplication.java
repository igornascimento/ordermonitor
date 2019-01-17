package com.objectedge;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class orderMonitorApplication extends Application<orderMonitorConfiguration> {

    public static void main(final String[] args) throws Exception {
        new orderMonitorApplication().run(args);
    }

    @Override
    public String getName() {
        return "orderMonitor";
    }

    @Override
    public void initialize(final Bootstrap<orderMonitorConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final orderMonitorConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
