package ru.geekbrains.samples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.samples.dao.Juggler;
import ru.geekbrains.samples.dao.Performer;

@Configuration
public class JugglerConfig {
//    Если использовать конструктор по умолчанию, то:
//    @Bean
//    public Performer duke() {
//        return new Juggler();
//    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }
}
