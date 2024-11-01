package lab13.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class main {
    private static String getLine(List<String> words) {
        StringBuilder result = new StringBuilder();
        List<String> usedWords = new ArrayList<>();

        if (!words.isEmpty()) { //если введена пустая сессия
            String currentWord = words.get(0);
            usedWords.add(currentWord);
            result.append(currentWord);

            while (true) {
                String nextWord = null;
                for (String word : words) { // перебор всех слов в списке
                    if (!usedWords.contains(word) && //слово не использованно
                            Character.toLowerCase(currentWord.charAt(currentWord.length() - 1)) ==
                                    Character.toLowerCase(word.charAt(0))) {
                        // и если поледняя буква текущего слова равна первой букве след слова
                        //Character.toLowerCase() - возвращает значение в нижнем регистре
                        nextWord = word;
                        break;
                    }
                }
                if (nextWord == null) {
                    break;
                }
                usedWords.add(nextWord);
                result.append(" ").append(nextWord);
                currentWord = nextWord;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова, разделяя их пробелом: ");
        String vvod = scanner.nextLine();
        List<String> words = Arrays.asList(vvod.split(" "));
        String res = getLine(words);
        System.out.println("Результат: "+ res);
    }
}
