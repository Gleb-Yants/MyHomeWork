package module_2.task_3;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */

import module_2.task_2.Paper;
import module_2.task_2.Pencil;
import module_2.task_2.Sticker;

/**
 * Inheritors - classes from 2nd task
 */
public abstract class Office_Supplies {
    public int count;
    public final String name;
    public final int cost;

    public Office_Supplies(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public static Office_Supplies[] newbiesPack() {
        return new Office_Supplies[]{new Paper(1), new Pencil(1), new Sticker(1)};
    }

    /* just for test
    public static void main(String[] args) {
        Office_Supplies[] a = Office_Supplies.newbiesPack();
        Paper b = (Paper)a[0];
        System.out.println(b.cost);
    }
    */
}
