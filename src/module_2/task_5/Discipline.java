package module_2.task_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Gleb_Yants on 01.06.2016.
 * CS and Math have double as grades, Logic - integer
 */
public enum Discipline {
    CS("CS"), MATH("Math"), LOGIC("Logic");
    private final String disc;
    private final HashMap<Student, Number> table = new HashMap();

    Discipline(String disc) {
        this.disc = disc;
    }

    public void addStudent(Student... st) {
        for (Student student : st) {
            table.put(student, 0);
        }
    }

    public void grade(Student st, Number num) {
        if (table.containsKey(st)) {
            if (disc.equals("Logic"))
                table.put(st, Math.round((double) num));
            else
                table.put(st, num);
        }
    }

    public void findGrades(Student st) {
        if (table.containsKey(st)) {
            System.out.println("Student " + st.name + " has grade by " + disc + " = " + table.get(st));
        }
    }

    @Override
    public String toString() {
        Iterator<Map.Entry<Student, Number>> entries = table.entrySet().iterator();
        StringBuilder strb = new StringBuilder();
        strb.append("Discipline " + disc + "\n");
        while (entries.hasNext()) {
            Map.Entry<Student, Number> entry = entries.next();
            strb.append("Student " + entry.getKey().name + " and his grade = " + entry.getValue() + "\n");
        }
        return strb.toString();
    }
}
