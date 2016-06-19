package task_3;

import java.io.*;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class UTFs {
    public static void convert(File a, File b) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(a));
             OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(b), "UTF-16")) {
            while (reader.ready()) {
                int data = reader.read();
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        convert(new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Cyrillic"), new File("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\UTF-16"));
    }
}
