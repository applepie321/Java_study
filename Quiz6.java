import java.util.Arrays;
import java.util.Scanner;

public class Quiz6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];
        int i;
        int temp;
        for (i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            System.out.println(Arrays.toString(arr));
        }
    }
}

