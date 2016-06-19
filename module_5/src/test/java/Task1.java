import org.junit.Test;
import task_1.FileManager;
import task_1.IncorrectNameException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class Task1 {
    @Test
    public void showFilesInDirectory() throws Exception {
        assert (FileManager.showFiles(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources")).equals("Another JustTest SomeFile"));
    }

    @Test
    public void makeTxt() throws Exception {
        FileManager.makeTxt("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW.txt");
        assert (new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW.txt").exists());
    }

    @Test
    public void DeleteTxt() throws Exception {
        FileManager.makeTxt("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW2.txt");
        assert (new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW2.txt").exists());
        FileManager.deleteTxt("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW2.txt");
        assert (!(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\NEW2.txt").exists()));
    }

    @Test
    public void recording() throws Exception {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\Record.txt")))) {
            while (reader.ready()) {
                sb.append(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileManager.recording("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\Record.txt", "RECORD");
        StringBuilder sb2 = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\My projects\\MyHomeWork\\module_5\\src\\main\\resources\\Another\\Record.txt")))) {
            while (reader.ready()) {
                sb2.append(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert ((sb.toString() + "RECORD").equals(sb2.toString()));
    }

    @Test
    public void throwMakeTxtException() throws Exception {
        try {
            FileManager.makeTxt("");
        } catch (IncorrectNameException e) {
            assert (e != null);
        }
    }
}
