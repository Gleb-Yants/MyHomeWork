package task_2;

import java.util.ListResourceBundle;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Postcards_ru extends ListResourceBundle {
    private final Object[][] content = new Object[][]{
            {"101", "������ ������"},
            {"102", "������ ������"},
            {"103", "������ ������"},
            {"104", "��������� ������"},
            {"1", "������ �����"},
            {"2", "������ �����"},
            {"3", "������ �����"},
            {"4", "��������� �����"}
    };

    protected Object[][] getContents() {
        return content;
    }
}