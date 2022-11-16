import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextBiggerNumber {
    public static void main(String[] args) {
        NextBiggerNumber nextBiggerNumber = new NextBiggerNumber();
        nextBiggerNumber.findNextBiggerNumber(new int[]{16, 17, 4, 3, 5, 2});
    }

    private void findNextBiggerNumber(int[] array) {
        List<Integer> sortedArray = new ArrayList<>();
        for(int num:array)
            sortedArray.add(num);
        Collections.sort(sortedArray);
        for(int i=0;i<array.length;i++){
            int nextBig = sortedArray.indexOf(array[i]);
            nextBig = nextBig==array.length-1?nextBig:nextBig+1;
            array[i] = sortedArray.get(nextBig);
        }
        System.out.println(Arrays.toString(array));
    }
}