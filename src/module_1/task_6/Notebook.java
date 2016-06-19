package module_1.task_6;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Notebook {
    Note[] notes = new Note[3];

    public void addNote(String text) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = new Note(text);
                break;
            }
            if (i == notes.length - 1) {
                System.out.println("Notebook is full");
            }
        }
    }

    public void deleteNote(int index) {
        if (index >= 0 && index < notes.length) {
            notes[index] = null;
        }
    }

    public void editNote(int index, String text) {
        if (index >= 0 && index < notes.length) {
            notes[index] = new Note(text);
        }
    }

    public void showAllNotes() {
        for (Note note : notes) {
            if (note != null) {
                System.out.println("# " + note.text);
            }
        }
    }
/* just for test
    public static void main(String[] args) {
        Notebook a = new Notebook();
        a.addNote("Perl");
        a.addNote("Python");
        a.addNote("Java");
        a.showAllNotes();
        a.deleteNote(0);
        a.showAllNotes();
        a.editNote(1, "something new");
        a.showAllNotes();
        a.deleteNote(1);
        a.addNote("C++");
        a.showAllNotes();
        a.addNote("Pascal");
        a.addNote("some");
        a.addNote("some");
        a.showAllNotes();
    }
    */
}
