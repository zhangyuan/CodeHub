import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import services.OneService;

@ComponentScan("services")
public class OneApplication implements ApplicationRunner {

    @Autowired
    OneService oneService;

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }


    public void run(ApplicationArguments args) throws Exception {
        oneService.apply();
    }
}
