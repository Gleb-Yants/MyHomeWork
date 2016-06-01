package module_2.task_4;

import module_2.task_3.Office_Supplies;

import java.util.Comparator;

/**
 * Created by Gleb_Yants on 01.06.2016.
 */
public class CoNameComparator implements Comparator<Office_Supplies> {
    public int compare(Office_Supplies o1, Office_Supplies o2) {
        int result = o1.name.compareTo(o2.name);
        if(result==0)
        result = o1.cost<o2.cost ? -1 : (o1.cost == o2.cost ? 0 : 1);
        return result;
    }
}
