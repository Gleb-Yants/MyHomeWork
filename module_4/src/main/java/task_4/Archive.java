package task_4;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class Archive {
    public static ArrayList<Film> films = new ArrayList<>();

    public static void deserialize() {
        try {
            FileInputStream is = new FileInputStream("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Serialization");
            ObjectInputStream ois = new ObjectInputStream(is);
            films = (ArrayList<Film>) ois.readObject();
        } catch (Exception e) {
        }
    }

    public static String showArchive() {
        return films.toString();
    }

    public static void add(Film f) {
        films.add(f);
    }

    public static void serialize() {
        try {
            FileOutputStream os = new FileOutputStream("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Serialization");

            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(films);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
