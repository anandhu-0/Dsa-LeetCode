/*
Problem: Find if the Sentence Is Pangram

Intuition:
    A pangram is a sentence that contains every letter of the English alphabet at least once. We can use a set to track the unique characters in the sentence.

Approach:
    Create a set to store unique characters from the sentence.
    Iterate through each character in the sentence and add it to the set.
    After processing the sentence, check if the size of the set is 26 (the number of letters in the English alphabet). If it is, then the sentence is a pangram.

Time Complexity: O(n) - We iterate through the sentence once.
Space Complexity: O(1) - We use a constant amount of space to store the unique characters.
*/
import java.util.HashSet;
import java.util.Set;

public class PangramSentence {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> sen = new HashSet<>();
        for(char ch : sentence.toCharArray()) sen.add(ch);
        return (sen.size()==26);
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.print(checkIfPangram(sentence));
    }
}
