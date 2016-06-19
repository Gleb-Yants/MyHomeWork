package task_2;


import task_3.Office_Supplies;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Paper extends Office_Supplies {

    public Paper(int count) {
        super("Paper", 5);
        this.count = count;
    }
}
