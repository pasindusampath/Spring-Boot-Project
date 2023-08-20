package lk.icet.spring.test;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Starter{
    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
