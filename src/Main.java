
//xoas phần tử khỏi mảng
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToDelete = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] newArr =  deleteElement(arr, elementToDelete);
        System.out.println("New array: " + Arrays.toString(newArr));
    }
    public static int[] deleteElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        } else {
            return arr;
        }
    }

}
