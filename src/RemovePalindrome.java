public class RemovePalindrome {

    public static void main(String[] args) {
        RemovePalindrome remove = new RemovePalindrome();
        remove.removePalindrome("He did a good deed");
    }

    private void removePalindrome(String string) {
        String[] stringArray = string.split(" ");
        string = "";
        for (String singleString : stringArray) {
            if (!isPalindrome(singleString.toUpperCase().trim())) {
                string += " " + singleString;
            }
        }
        System.out.println(string);
    }

    private boolean isPalindrome(String singleString) {
        int start = 0;
        int end = singleString.length() - 1;
        while (start < end) {
            if (singleString.charAt(start) != singleString.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
