import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a[] = new int[5];
        int i;
        for (i = 0; i < a.length; i++) { //i = 0을 대입하고 a의 배열 개수보다 i가 작을 경우 반복한다. i증감식
            a[i] = s.nextInt();
        } //Scanner

        for (i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) { //
                if (a[i] < a[j]) { //값이 a[i]가 a[j]보다 작을경우
                    int c = a[i]; //값을 서로 바꿈
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]); //출력
        }
    }
}

