package task_2;

import task_1.NFException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Gleb_Yants on 19.06.2016.
 */
public class PropertiesManager {
    //  static Map<String, String> prop = new HashMap<>();
    public static String getV(File f, String k) throws NotFoundKeyException, NFException {
        if (!(f.exists())) {
            throw new NFException();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split("=");
                if (line[0].trim().equals(k)) {
                    return line[1].trim();
                    //   return prop.put(k, line[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new NotFoundKeyException();
    }
}
