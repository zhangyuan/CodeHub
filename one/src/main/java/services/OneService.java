package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oneService")
public class OneService {
    public int apply() {
        return 1;
    }
}
