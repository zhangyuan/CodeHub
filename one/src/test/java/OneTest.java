import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.OneDao;
import services.OneService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OneApplication.class)
public class OneTest {
    @Autowired
    OneService oneService;

    @Autowired
    OneDao oneDao;

    @Test
    public void testOneServiceApply() throws Exception {
        assertEquals(1, oneService.apply());
    }
}
