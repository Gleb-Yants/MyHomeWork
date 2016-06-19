package task_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gleb_Yants on 12.06.2016.
 */
public class KeyWords2 {

    public static final HashMap<String, Integer> keyWords2 = new HashMap<String, Integer>() {{
        put("abstract", 0);
        put("continue", 0);
        put("for", 0);
        put("new", 0);
        put("switch", 0);
        put("assert", 0);
        put("default", 0);
        put("goto", 0);
        put("package", 0);
        put("synchronized", 0);
        put("boolean", 0);
        put("do", 0);
        put("if", 0);
        put("private", 0);
        put("this", 0);
        put("break", 0);
        put("double", 0);
        put("implements", 0);
        put("protected", 0);
        put("throw", 0);
        put("byte", 0);
        put("else", 0);
        put("import", 0);
        put("public", 0);
        put("throws", 0);
        put("case", 0);
        put("enum", 0);
        put("instanceof", 0);
        put("return", 0);
        put("transient", 0);
        put("catch", 0);
        put("extends", 0);
        put("int", 0);
        put("short", 0);
        put("try", 0);
        put("char", 0);
        put("final", 0);
        put("interface", 0);
        put("static", 0);
        put("void", 0);
        put("class", 0);
        put("finally", 0);
        put("long", 0);
        put("strictfp", 0);
        put("volatile", 0);
        put("const", 0);
        put("float", 0);
        put("native", 0);
        put("super", 0);
        put("while", 0);
    }};

    public static String getStringOfFile2() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\ExampleOfCode"))) {
            String a;
            while ((a = reader.readLine()) != null) {
                sb.append(a);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public static void keyWordsCounting2() {
        String[] str = KeyWords2.getStringOfFile2().split("\\s");
        for (String st : str) {
            if (KeyWords2.keyWords2.containsKey(st)) {
                int tmp = KeyWords2.keyWords2.get(st);
                KeyWords2.keyWords2.put(st, ++tmp);
            }
        }
    }

    public static void outToTheFile2() {
        keyWordsCounting2();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : keyWords2.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue() + "\n");
        }
        try (BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\My projects\\MyHomeWork\\module_4\\src\\main\\resources\\Result")))) {
            writer.write(sb.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
