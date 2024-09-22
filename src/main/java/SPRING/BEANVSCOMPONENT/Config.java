package SPRING.BEANVSCOMPONENT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ClassToBeBean makeItABean() {
        return new ClassToBeBean("Memed");
    }

}
