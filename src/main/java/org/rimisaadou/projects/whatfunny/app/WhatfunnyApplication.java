package org.rimisaadou.projects.whatfunny.app;

import org.glassfish.jersey.server.ResourceConfig;

public class WhatfunnyApplication extends ResourceConfig {

    public WhatfunnyApplication() {
        // Define the package which contains the service classes.
        packages("org.rimisaadou.projects.whatfunny.services");
    }
}
