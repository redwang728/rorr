package com.my;

import com.my.socket.SocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zunyun on 17-10-28.
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) throws Exception{
//        SpringApplication springApplication = new SpringApplication(Application.class);

        SpringApplication.run(Application.class, args);
    }
}
