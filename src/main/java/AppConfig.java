import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ziko.spring.core.repository.HibernateSpeakerRepositoryImpl;
import ziko.spring.core.repository.SpeakerRepository;
import ziko.spring.core.service.SpeakerService;
import ziko.spring.core.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
