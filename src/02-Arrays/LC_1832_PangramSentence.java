import java.util.HashSet;
import java.util.Set;

public class LC_1832_PangramSentence {
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
