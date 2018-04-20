package springboot.scheduled_tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableEurekaClient
public class ScheduledTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledTasksApplication.class, args);
	}
}
