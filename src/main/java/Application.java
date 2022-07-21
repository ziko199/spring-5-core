import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ziko.spring.core.service.SpeakerService;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
