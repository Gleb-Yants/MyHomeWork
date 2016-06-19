import org.junit.Test;
import task_2.Language;
import task_2.Postcards;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class Task_2 {
    @Test
    public void showQuestions() throws Exception {
        assert (Postcards.getQuestions() != "");
        System.out.println(Postcards.getQuestions());
    }

    @Test
    public void getAnswerRu() throws Exception {
        Postcards.changeLanguage(Language.ru);
        assert (Postcards.getAnswer(2).equals("Второй ответ"));
    }

    @Test
    public void changeLanguageAndGetAnswerEn() throws Exception {
        Postcards.changeLanguage(Language.en);
        assert (Postcards.getAnswer(2).equals("Second answer"));
    }
}
