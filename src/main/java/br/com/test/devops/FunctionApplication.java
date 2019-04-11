package br.com.test.devops;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.test.devops.core.service.FunctionService;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class FunctionApplication {

    private final FunctionService functionService;
    
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FunctionApplication.class, args);
	}
	
    @Bean
	public Function<String, String> testStr() {
        return filial -> functionService.testStr(filial);
	}
}