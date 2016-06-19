import org.junit.Test;
import task_3.UTFs;

import java.io.File;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class Task3 {
    @Test
    public void compare() throws Exception {
        File a = new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Cyrillic");
        File b = new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\UTF-16");
        UTFs.convert(a, b);
        assert (b.exists());
    }
}
