package module_2.task_2;

import module_2.task_3.Office_Supplies;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Accounting {
    public static int checkEmployee(Employee e){
        int result=0;
        if(e.pa!=null){
           result=e.pa.count*e.pa.cost;
        }
        if(e.pe!=null){
            result+=e.pe.count*e.pe.cost;
        }
        if(e.st!=null){
            result+=e.st.count*e.st.cost;
        }
        return result;
    }
/* just for test

    public static void main(String[] args) {
        Employee e = new Employee(new Paper(1), new Pencil(1),new Sticker(1));
        System.out.println(checkEmployee(e));
    }

    */
}
