//Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice.
//
//        Example 1:
//
//        Input:
//        N = 11
//        arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
//        Output: 4
//        Explanation: 4 is the only element that
//        appears exactly once.
//
//        Expected Time Complexity: O(log N)
//        Expected Auxiliary Space: O(1)

import java.util.Scanner;

public class FindOnceAmongTwoElement {
    public static void main(String[] args) {
        FindOnceAmongTwoElement findOnceAmongTwoElement = new FindOnceAmongTwoElement();
        findOnceAmongTwoElement.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int limit = scan.nextInt();
        int[] array = new int[limit];
        System.out.println("Enter the " + limit + " values");
        for (int i = 0; i < limit; i++)
            array[i] = scan.nextInt();
//        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 50, 65, 65};
        int num = findOnce(array);
        System.out.println(num);
    }

    private int findOnce(int[] array) {
        int len = array.length - 1;
        int start = 0;
        int end = len;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid >= len) {
                if (array[mid] != array[mid - 1]) {
                    return array[mid];
                }
            }
            if (mid == 0) {
                if (array[mid] != array[mid + 1]) {
                    return array[mid];
                }
            }
            if (array[mid] != array[mid - 1] && array[mid] != array[mid + 1]) {
                return array[mid];
            }
            if (array[mid] == array[mid - 1]) {
                int size = (mid - start) % 2;
                if (size == 1) start = mid + 1;
                else end = mid - 1;
            } else {
                int size = (mid - start) % 2;
                if (size == 0) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
