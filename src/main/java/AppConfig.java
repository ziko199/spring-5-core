import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import ziko.spring.core.repository.HibernateSpeakerRepositoryImpl;
import ziko.spring.core.repository.SpeakerRepository;
import ziko.spring.core.service.SpeakerService;
import ziko.spring.core.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"ziko.spring.core"})
public class AppConfig {

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
