import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String paragraph = "Lorem Ipsum is simply dummy text of the printing and typesetting industry" +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of" +
                " type and scrambled it to make a type specimen book It has survived not only five centuries but also " +
                "the leap into electronic typesetting, remaining essentially unchanged It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum";

        Map<String, Integer> countWords = new HashMap<>();


        for (String word : paragraph.split(" ")) {

            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }


        String minWord = "";
        String maxWord = "";
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count < minCount) {
                minCount = count;
                minWord = word;
            }

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
        }

        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("\nWord with minimum occurrence: " + minWord + " - " + minCount);
        System.out.println("Word with maximum occurrence: " + maxWord + " - " + maxCount);
    }
}
