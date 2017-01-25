package com.thecoffeine.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Discovery application class.
 *
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class DiscoveryApplication {

    /**
     * Entry point.
     *
     * @param args    Run args.
     */
    public static void main( String [] args ) {
        SpringApplication.run( DiscoveryApplication.class, args );
    }
}
