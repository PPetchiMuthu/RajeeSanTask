public class CompressTheString {
    public static void main(String[] args) {
        CompressTheString compressTheString = new CompressTheString();
        compressTheString.compress("aaabbcdd");
    }
    private void compress(String str){
        int count = 1;
        String string = ""+str.charAt(0);
        for(int i =1 ;i<str.length();i++){
           if(str.charAt(i-1)!=str.charAt(i)) {
               if (count == 1)
                   string += str.charAt(i);
               else string+=count + "" +str.charAt(i);
               count = 1;
           } else count++;
        }
        if (count != 1)
           string+=count;
        System.out.println(string);
    }
}
