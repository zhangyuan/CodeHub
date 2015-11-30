import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

class PropertyManager {
    public void printAll() {
        Properties properties = System.getProperties();
        Enumeration<?> enumeration = properties.propertyNames();

        while (enumeration.hasMoreElements()) {
            Object name = enumeration.nextElement();
            Object value = properties.get(name);
            System.out.println(String.format("%s = %s", name, value));
        }
    }

    public void LoadSampleProperty() throws IOException {
        Properties properties = System.getProperties();
        properties.load(getClass().getResourceAsStream("sample.properties"));
    }

    public Object getProperty(String name){
        Properties properties = System.getProperties();
        return properties.getProperty(name);
    }
}
