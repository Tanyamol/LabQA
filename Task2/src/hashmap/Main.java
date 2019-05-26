package hashmap;

public class Main {
    public static void main(String[] args) {

        Translator translator = new Translator();
        translator.setWords();
        System.out.println(translator.addWords());
        System.out.println(translator.translator);
        System.out.println(translator.searchWords());

    }
}
