public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = {"flower","fly","flow"};
        System.out.println(longestCommonPrefix.findLongestCommonPrefix(str));
    }

    public String findLongestCommonPrefix(String[] strings) {
        String target = strings[0];
        for(String val : strings) {
            int length = target.length();
            if(length==0)
                return target;
            if(length>val.length())
                length = val.length();
            for (int i = 0; i < length; i++)
                if (val.charAt(i) != target.charAt(i)) {
                    target = val.substring(0, i);
                    break;
                }
            if(target.length()>val.length())
                target = val;
        }
        return target;
    }
}
