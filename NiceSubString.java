import java.util.HashSet;
import java.util.Set;

public class NiceSubString {
    public static void main(String[] args) {
        NiceSubString niceSubString = new NiceSubString();                //"YazaAay" input
        String s = niceSubString.longestNiceSubstring("YazaAay");            // "Bb" input
        System.out.println(s);
    }

    private String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray())
            set.add(ch);
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i))))
                continue;
            String str1 = longestNiceSubstring(s.substring(0, i));
            String str2 = longestNiceSubstring(s.substring(i + 1));
            return str1.length() >= str2.length() ? str1 : str2;
        }
        return s;
    }
}
