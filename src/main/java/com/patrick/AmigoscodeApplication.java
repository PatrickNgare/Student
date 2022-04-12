package com.patrick;

import com.patrick.data.models.Student;
import com.patrick.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@Slf4j
@SpringBootApplication(scanBasePackages="com.patrick")
public class AmigoscodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentService studentService) {
        return args -> {
            Student patrick = new Student("patrick", "jones", "patrickngar8e@gmail.com", 21);
            studentService.save(patrick);
        };
    }
}
