package task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Gleb_Yants on 25.06.2016.
 */
public class FindRef {
    public static void findRef() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_3\\src\\main\\resources\\someInfo.html"));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            text.append(line.trim());
        }
        String result = text.toString().substring(text.toString().indexOf("<br style=\"clear:both;\">") + 24, text.toString().length());
        String[] tmp = result.split("<p>|</p>|</div>|<div>|</body>|</html>|&nbsp;|");
        text = new StringBuilder();
        for (String a : tmp) {
            text.append(a);
        }
        String myRegex = ".*(\\([–р]ис..*\\)).*";
        String regex = "([ј-яA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*([.?!]))";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        ArrayList<String> temp = new ArrayList<>();
        while (m.find()) {
            if (m.group().matches(myRegex)) {
                System.out.println(m.group());
                temp.add(m.group());
            }
        }
        String q = "(\\([–р]ис..{1,9}\\))";
        Pattern e = Pattern.compile(q);
        for (String b : temp) {
            Matcher r = e.matcher(b);
            while (r.find()) {
                System.out.print(r.group() + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        findRef();
    }
}
