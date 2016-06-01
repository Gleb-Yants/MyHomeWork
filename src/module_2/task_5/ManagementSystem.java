package module_2.task_5;

/**
 * Created by Gleb_Yants on 01.06.2016.
 */
public class ManagementSystem {

    public static void findDiscipline(Student st){
        for(Discipline d : Discipline.values()){
            d.findGrades(st);
        }
    }

    /* just for test

    public static void main(String[] args) {
        Student a = new Student("Vasya");
        Student b = new Student("Petya");
        Student c = new Student("Jenya");
        Discipline.CS.addStudent(a, b, c);
        Discipline.CS.grade(a, 5.0);Discipline.CS.grade(b, 4.5);Discipline.CS.grade(c, 3);

        Student d = new Student("Tanya");
        Student e = new Student("Sasha");
        Discipline.MATH.addStudent(d,e,a);
        Discipline.MATH.grade(d, 2.0);Discipline.MATH.grade(e, 1.5);Discipline.MATH.grade(a, 7.7);

        Student f = new Student("Gena");
        Student g = new Student("Vitaliy");
        Discipline.LOGIC.addStudent(f,g,a);
        Discipline.LOGIC.grade(f, 2.1);Discipline.LOGIC.grade(g, 1.5);Discipline.LOGIC.grade(a, 6.6);

        System.out.println(Discipline.CS);
        System.out.println(Discipline.MATH);
        System.out.println(Discipline.LOGIC);
        findDiscipline(a);
    }

    */
}
