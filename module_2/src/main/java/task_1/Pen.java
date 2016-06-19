package task_1;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Pen {
    int x, y, z;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (x != pen.x) return false;
        if (y != pen.y) return false;
        if (z != pen.z) return false;
        return !(color != null ? !color.equals(pen.color) : pen.color != null);

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color='" + color + '\'' +
                '}';
    }
}
