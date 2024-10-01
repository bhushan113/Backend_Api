package org.example.backend_api_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BackendApiAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApiAssignmentApplication.class, args);
    }

}
