import org.junit.Test;
import task_4.Archive;
import task_4.Film;

/**
 * Created by Gleb_Yants on 18.06.2016.
 */
public class Task4 {
    @Test
    public void addToArchive() throws Exception {
        Film f = new Film("Matrix", "Kianu Riwes", "Morpheus");
        Archive.add(new Film("Natural Born Killers", "Woodie Harrelson"));
        Archive.add(f);
        Archive.add(new Film("Terminator", "Schwarznegger"));
        assert (Archive.films.get(1).equals(f));
        Archive.serialize();
    }

    //Run tests - sequential
    @Test
    public void serialize() throws Exception {
        Film f = new Film("Matrix", "Kianu Riwes", "Morpheus");
        Archive.deserialize();
        assert (Archive.films.get(1).equals(f));
    }
}
