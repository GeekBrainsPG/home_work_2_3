import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<Integer>> phoneBook = new HashMap<>();

    public void add(int phone, String surname) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phone);
        } else {
            phoneBook.put(surname, new ArrayList<>(List.of(phone)));
        }
    }

    public List<Integer> get(String surname) {
        if (phoneBook.containsKey(surname)) {
            return phoneBook.get(surname);
        }

        return List.of();
    }
}
