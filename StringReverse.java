//Test case-1: Following steps can be performed:
//        abdeba \to abebadabdeba→abebad
//        abebad \to abeadbabebad→abeadb
//        abeadb \to abedbaabeadb→abedba
//        Test case-2: following steps can be performed:
//        codechef \to codechfecodechef→codechfe
//        codechfe \to codecfehcodechfe→codecfeh
//        codecfeh \to codefehccodecfeh→codefehc
//        codefehc \to codfehcecodefehc→codfehce
//        codfehce \to cofehcedcodfehce→cofehced
//        cofehced \to cfehcedocofehced→cfehcedo
//        cfehcedo \to fehcedoccfehcedo→fehcedo

public class StringReverse {
    public static void main(String[] args) {
        StringReverse stringReverse =new StringReverse();
        stringReverse.reverse("abdeba");
    }
    private void reverse(String str) {
        int start = 0,end = 0;
        while(start<str.length()){
            if(str.charAt(start)==str.charAt(str.length()-1-end)){
                start++;
                end++;
            }else
                start++;
        }
        System.out.println(str.length()-end);
    }
}
