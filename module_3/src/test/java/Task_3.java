import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Task_3 {
    @Test
    public void fingJpg() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_3\\src\\main\\resources\\someInfo.html"));
        String line;
        List<String> lines = new ArrayList<String>();
        int i = 0;
        while ((line = reader.readLine()) != null) {
            if (line.matches(".*(\\.jpg)+.*")) {
                lines.add(line);
                System.out.println(++i);
                System.out.println(line);
            }
        }
    }

    @Test
    public void findRef() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_3\\src\\main\\resources\\someInfo.html"));
        String line;
        List<String> lines = new ArrayList<String>();
        int i = 0;
        while ((line = reader.readLine()) != null) {
            if (line.matches(".*(\\([р–]ис\\.\\s.+\\))+.*")) {
                lines.add(line);
                System.out.println(++i);
                System.out.println(line);
            }
        }
    }
}
