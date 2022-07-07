import java.util.*;

public class Method {
    //User input
    public String Input() {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence");
        String str = scanner.nextLine();
        return str;
    }
    
    public void ProcessList(String input) {
        String[] words = ReplaceAndSplit(input);
        words = GetUniqueNonEmptyWords(words);
        FirstLetterToUppercase(words);

        ShowList(words);
    }

    private String[] ReplaceAndSplit(String input) {
         /*Replace all required symbols
         Replace characters with one common*/
        Character splitSymbol = '#';
        Set<Character> symbols = new HashSet<Character>() {
            {
                add(',');
                add('.');
                add(' ');
            }
        };

        for (Character symbol : symbols)
            input = input.replace(symbol, splitSymbol);


        /*Split string by words*/
        String[] words = input.split(splitSymbol.toString());

        return words;
    }
    /*Method returns unique values with case sensitivity*/
    private String[] GetUniqueNonEmptyWords(String[] words) {
        Set<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        /*Empty string check*/
        for (String word : words) {
            if (word.isEmpty())
                continue;

            uniqueWords.add(word);
        }
        /*List to array*/
        return uniqueWords.toArray(new String[uniqueWords.size()]);
    }
        /*Iterates over words,transform to lowercase,change the capitalization of first letter of each word*/
    private void FirstLetterToUppercase(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);
            words[i] = words[i]
                    .toLowerCase()
                    .replaceFirst(firstLetter, firstLetter.toUpperCase());
        }
    }

    private void ShowList(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
