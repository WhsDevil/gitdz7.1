import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {      // если символ - буква
                if (letters.get(text.charAt(i)) == null) { // если этой буквы еще нет в мапе
                    letters.put(Character.toLowerCase(text.charAt(i)), 1);
                }
                else {                                     // если буква уже была в мапе
                    letters.put(Character.toLowerCase(text.charAt(i)), letters.get(text.charAt(i)) + 1);
                }
            }
        }

        int minValue = Integer.MAX_VALUE, maxValue = 0;
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            if (letter.getValue() < minValue) minValue = letter.getValue();
            if (letter.getValue() > maxValue) maxValue = letter.getValue();
        }
        System.out.println(letters);
        System.out.println("Минимум - " + minValue);
        System.out.println("Максимум - " + maxValue);
    }
}