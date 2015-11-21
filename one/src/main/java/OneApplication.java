import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.OneService;

@ComponentScan(basePackages = "services")
@Configuration
public class OneApplication implements ApplicationRunner {

    @Autowired
    OneService oneService;

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }


    public void run(ApplicationArguments args) throws Exception {
        System.out.println(oneService.apply());
    }
}
