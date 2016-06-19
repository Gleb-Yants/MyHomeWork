import org.junit.BeforeClass;
import org.junit.Test;
import task_1.KeyWords;

import java.io.File;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Task1 {
    @BeforeClass
    public static void setUp() throws Exception {
        KeyWords.outToTheFile();
    }

    @Test
    public void getInputString() throws Exception {
        assert (KeyWords.getStringOfFile() != "");
    }

    @Test
    public void keyWordsCounting() throws Exception {
        assert (KeyWords.keyWords.get("static") == 6);
    }

    @Test
    public void out() throws Exception {
        File tmp = new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Result");
        assert (tmp.exists());
    }
}
