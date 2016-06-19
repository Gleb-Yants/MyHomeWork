package task_4;

import task_3.Office_Supplies;

import java.util.Comparator;

/**
 * Created by Gleb_Yants on 31.05.2016.
 */
public class CostComparator implements Comparator<Office_Supplies> {
    @Override
    public int compare(Office_Supplies o1, Office_Supplies o2) {
        return (o1.cost < o2.cost ? -1 : (o1.cost == o2.cost ? 0 : 1));
    }


    /* just for test

    public static void main(String[] args) {
        Office_Supplies[] a = new Office_Supplies[]{new Pencil(1),new Sticker(1),new Paper(1),new Pencil(1),new Sticker(1)};
        for(Office_Supplies b :a){
            System.out.println(b);
        }
        System.out.println("////////");
        Arrays.sort(a, new CoNameComparator());

        for(Office_Supplies b :a){
            System.out.println(b);
        }
    }

    */
}
