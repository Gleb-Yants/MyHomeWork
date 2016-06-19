package task_2;

import java.util.ListResourceBundle;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Postcards_ru extends ListResourceBundle {
    private final Object[][] content = new Object[][]{
            {"101", "Первый вопрос"},
            {"102", "Второй вопрос"},
            {"103", "Третий вопрос"},
            {"104", "Четвертый вопрос"},
            {"1", "Первый ответ"},
            {"2", "Второй ответ"},
            {"3", "Третий ответ"},
            {"4", "Четвертый ответ"}
    };

    protected Object[][] getContents() {
        return content;
    }
}