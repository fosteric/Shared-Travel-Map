import com.alidade.controller.HomeController;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest {

    @Test
    public void testApp(){
        HomeController hc = new HomeController();
        String actual = hc.home();
        String expected = "Shared travel app is up and running";
        assertEquals(expected, actual);
    }

}