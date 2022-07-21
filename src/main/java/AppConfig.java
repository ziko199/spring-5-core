import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ziko.spring.core.util.CalendarFactory;

import java.util.Calendar;

@Configuration
@ComponentScan({"ziko.spring.core"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory () {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }

/**
 * Setter Injection
 *
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

 * Construction Injection
 *
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        return service;
    }



@Bean(name = "speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public SpeakerService getSpeakerService() {
    SpeakerServiceImpl service = new SpeakerServiceImpl();
    return service;
}

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
 */


}
