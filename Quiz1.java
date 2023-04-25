import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요 : \n");
        a = s.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("3, 5의 배수입니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수 입니다.");
        } else
            System.out.println("3, 5의 배수 모두 아닙니다");
    }


}
/*코딩 확인용 문제

예시1)

입력값 : 30
출력결과
"3의 배수와 5의 배수를 둘다 만족합니다."

예시2)

입력값 : 6
출력결과
"3의 배수입니다."

예시3)

입력값 : 10
출력결과
"5의 배수입니다." */