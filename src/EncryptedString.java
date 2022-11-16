public class EncryptedString {
    public static void main(String[] args) {
        EncryptedString encryptedString = new EncryptedString();
        encryptedString.findEncryptedString("bvjk","afdr");
    }

    private void findEncryptedString(String string1, String string2) {
        String str = "";
        for(int i=0;i<string1.length();i++){
            str += (char)((((string1.charAt(i)+string2.charAt(i))-2*96)%26)+96);
        }
        System.out.println(str);
    }
}
