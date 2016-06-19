package task_2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Postcards {
    private static ResourceBundle rb = ResourceBundle.getBundle("task_2.Postcards", new Locale("ru"));

    public static String getQuestions() {
        StringBuilder sb = new StringBuilder();
        int j = 1;
        for (int i = 101; i < 105; i++) {
            sb.append("#" + j + " " + rb.getString(Integer.toString(i)));
            sb.append("\n");
            j++;
        }
        return sb.toString();
    }

    public static String getAnswer(int index) {
        return rb.getString(Integer.toString(index));
    }

    public static void changeLanguage(Language l) {
        if (l == Language.en) {
            rb = ResourceBundle.getBundle("task_2.Postcards", new Locale("en"));
        } else rb = ResourceBundle.getBundle("task_2.Postcards", new Locale("ru"));
    }
}
