package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {

    HashMap<String, String> translator = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String englishWord;
    String russianWord;

    public void setWords() {
        translator.put("Bug", "Ошибка");
        translator.put("Testing", "Тестирование");
        translator.put("Load", "Нагрузка");
        translator.put("Exit", "Выход");
        translator.put("Open", "Открыть");
    }

    public HashMap<String, String> addWords() {

        System.out.println(" Input english world");
        englishWord = sc.next();
        System.out.println(" Input russian world");
        russianWord = sc.next();
        translator.put(englishWord, russianWord);
        return translator;
    }

    public String searchWords() {
        String[] searchString = new String[2];
        System.out.println("Input phrase to translate");
        searchString[0] = sc.next();
        searchString[1] = sc.next();
        String translateWord = "";
        for (int i = 0; i < searchString.length; i++) {
            inner:
            for (int j = 0; j < translator.size(); j++) {
                if (translator.containsKey(searchString[i])) {
                    translateWord = translateWord + translator.get(searchString[i]) + " ";
                    break inner;
                }
            }
        }
        return translateWord;

    }

}
