package task_4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class Film implements Serializable {
    private final String name;
    private final ArrayList<String> actors = new ArrayList<>();

    public Film(String name, String... actors) {
        this.name = name;
        for (String actor : actors) {
            this.actors.add(actor);
        }
    }

    @Override
    public String toString() {
        return name + " starring " + actors.toString();
    }

    //check only for filmname
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        return !(name != null ? !name.equals(film.name) : film.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
