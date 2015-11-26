import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.OneDao;
import services.OneService;

import static org.easymock.EasyMock.anyInt;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OneApplication.class)
public class OneTestWithMock {
    @Autowired
    @TestSubject
    OneService oneService;

    @Autowired
    @Mock
    OneDao oneDao;

    @Test
    public void testOneServiceApplyWithParameter() throws Exception {
        EasyMockSupport.injectMocks(this);
        EasyMock.expect(oneDao.apply(anyInt())).andReturn(10);

        EasyMock.replay(oneDao);

        assertEquals(10, oneService.apply(1));
    }
}
