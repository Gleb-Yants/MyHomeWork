package task_4;

import task_3.Office_Supplies;

import java.util.Comparator;

/**
 * Created by Gleb_Yants on 01.06.2016.
 */
public class NameComparator implements Comparator<Office_Supplies> {
    @Override
    public int compare(Office_Supplies o1, Office_Supplies o2) {
        return o1.name.compareTo(o2.name);
    }

}
