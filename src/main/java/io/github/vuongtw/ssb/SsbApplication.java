package io.github.vuongtw.ssb;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class SsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsbApplication.class, args);
	}
}
