import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args){
        int[]a = new int[5];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            System.out.println("숫자입력: ");
            a[i] = s.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        float avg = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            } else if(a[i] < min) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        avg = sum / (float)a.length;

        System.out.printf("최대 %d, 최소 %d, 평균 %f", max, min, avg);


    }

}


/*
5개의 입력 받는 정수(중복가능) 중 가장 큰 값과 가장 작은 값, 평균 값을 출력하시오.
코드 한 줄마다 본인이 이해한 내용으로 주석 달아주길 바랍니다.

반드시 배열 사용

(입력 예) : 100, 200, 100, 300, 400
(출력 예) : 가장 큰 값 : 400 / 가장 작은 값 : 100 / 평균 값 : 220
*/