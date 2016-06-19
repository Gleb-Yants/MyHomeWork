import org.junit.Test;
import task_1.NFException;
import task_2.NotFoundKeyException;
import task_2.PropertiesManager;

import java.io.File;

/**
 * Created by Gleb_Yants on 19.06.2016.
 */
public class Task2 {
    @Test
    public void getV() throws Exception {
        String result = PropertiesManager.getV(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\test\\resources\\digits.properties"), "SOME_DOUBLE_VALUE");
        assert (result.equals("1.2"));
    }

    @Test
    public void getNFKE() throws Exception {
        try {
            String result = PropertiesManager.getV(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\test\\resources\\digits.properties"), "BLA");
        } catch (NotFoundKeyException e) {
            assert (e != null);
        }
    }

    @Test
    public void getNFE() throws Exception {
        try {
            String result = PropertiesManager.getV(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\test\\resources\\digits.propertiesbr"), "SOME_DOUBLE_VALUE");
        } catch (NFException e) {
            assert (e != null);
        }
    }
}
