package io.backened.ipldashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IplDashboardApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IplDashboardApplication.class, args);
	}
}
