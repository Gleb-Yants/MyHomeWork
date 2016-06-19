package task_2;

import java.util.ListResourceBundle;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Postcards_en extends ListResourceBundle {
    private final Object[][] content = new Object[][]{
            {"101", "First question"},
            {"102", "Second question"},
            {"103", "Third question"},
            {"104", "Fourth question"},
            {"1", "First answer"},
            {"2", "Second answer"},
            {"3", "Third answer"},
            {"4", "Fourth answer"}
    };

    protected Object[][] getContents() {
        return content;
    }
}
