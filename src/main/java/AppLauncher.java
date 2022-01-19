import java.util.*;

public class AppLauncher {

    public static void main(String[] args) {
        wordCounter();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(123456789, "Surname1");
        phoneBook.add(223456789, "Surname2");
        phoneBook.add(323456789, "Surname1");
        phoneBook.add(423456789, "Surname4");
        phoneBook.add(523456789, "Surname5");
    }

    public static void wordCounter() {
        Map<String, Integer> uniqueWords = new HashMap<String, Integer>();
        List<String> words = new ArrayList<>();
        words.add("Создать");
        words.add("массив");
        words.add("набор");
        words.add("слов");
        words.add("слов");
        words.add("список");
        words.add("состоит");
        words.add("массив");
        words.add("дубликаты");
        words.add("слово");
        words.add("массив");

        words.forEach(word -> {
            if (uniqueWords.containsKey(word)) {
                int counter = uniqueWords.get(word);
                uniqueWords.put(word, ++counter);
            } else {
                uniqueWords.put(word, 1);
            }
        });

        words.forEach(word -> {
            System.out.printf("Word: %s, met %d times \n", word, uniqueWords.get(word));
        });
    }

}