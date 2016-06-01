package module_2.task_2;

import module_2.task_3.Office_Supplies;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Pencil extends Office_Supplies {

    public Pencil(int count) {
        super("Pencil", 30);
        this.count = count;
    }
}
