package singh.mahabir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Main class to start turbine
 * 
 * @author Mahabir Singh
 *
 */

@SpringBootApplication

/*
 * @EnableTurbine is required to start the turbine
 * 
 * and @EnableHystrixDashboard is used to see the status on hystrix UI
 */
@EnableTurbine
@EnableHystrixDashboard
public class TurbineStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineStreamApplication.class, args);
    }
}