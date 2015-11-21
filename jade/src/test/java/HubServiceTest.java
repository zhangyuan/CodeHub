import org.easymock.EasyMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HubServiceTest {
    @Test
    public void testOk(){
        assertTrue(true);
    }

    @Test
    public void testFind() throws Exception {
        HubDao mockDao = EasyMock.mock(HubDao.class);

        HubService service = new HubService();
        service.setHubDao(mockDao);

        HubEntity entity = new HubEntity("foo");
        EasyMock.expect(mockDao.find(1)).andReturn(entity);

        EasyMock.replay(mockDao);

        HubEntity hubEntity = service.find(1);
        assertEquals("foo", hubEntity.getName());
    }
}
