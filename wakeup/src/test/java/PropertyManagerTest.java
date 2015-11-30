import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyManagerTest {
    @Test
    public void testGetProperty() throws Exception {
        PropertyManager runner = new PropertyManager();
        runner.LoadSampleProperty();
        Object environment = runner.getProperty("environment");
        assertEquals("test", environment.toString());
    }
}
