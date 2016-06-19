import org.junit.BeforeClass;
import org.junit.Test;
import task_2.KeyWords2;

import java.io.File;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Task2 {

    @BeforeClass
    public static void setUp() throws Exception {
        KeyWords2.outToTheFile2();
    }

    @Test
    public void getInputString() throws Exception {
        assert (KeyWords2.getStringOfFile2() != "");
    }

    @Test
    public void keyWordsCounting() throws Exception {
        assert (KeyWords2.keyWords2.get("static") == 6);
    }

    @Test
    public void out() throws Exception {
        File tmp = new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Result");
        assert (tmp.exists());
    }
}
