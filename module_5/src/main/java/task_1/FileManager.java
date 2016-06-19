package task_1;

import java.io.*;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class FileManager {
    public static String showFiles(File f) throws IncorrectNameException {
        if (f.getName().equals("")) {
            throw new IncorrectNameException();
        }
        StringBuilder sb = new StringBuilder();
        File[] fls = f.listFiles();
        for (File fl : fls) {
            sb.append(fl.getName() + " ");
        }
        return sb.toString().trim();
    }

    public static void makeTxt(String path) throws IncorrectNameException {
        if (path.equals("")) {
            throw new IncorrectNameException();
        }
        try {
            File f = new File(path);
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteTxt(String path) throws NFException {
        File f = new File(path);
        if (!f.exists()) {
            throw new NFException();
        }
        f.delete();
    }

    public static void recording(String path, String append) throws NFException {
        if (!(new File(path).exists())) {
            throw new NFException();
        }
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path, true)))) {
            pw.write(append);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
