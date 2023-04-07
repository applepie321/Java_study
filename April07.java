package org.example.Java_study;

import java.util.Arrays;
import java.util.Scanner;

public class April07
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in); // 문자열 입력
        System.out.println("Input number : ");
        String input = s.nextLine(); // 입력 받은 문자열을 변수명 ( input )으로 명명
        if (input.length() != 5 || input.chars().distinct().count() != input.length())

        {
            System.out.println("Invalid number");
        }
        // 문자열( input )의 길이( .length() )가 5가 아닐때
        // 또는 ( || )
        // 문자열( input )을 char형으로 변환( .chars() ) 중복 제거( .distinct() ) 후의 char의 개수( .count )가
        // 문자열( input )의 길이( .length() )와 같지 않을 떄 "Invalid number" 출력
        // e.g. 문자열이 13335 일시 전자는 1, 3, 5의 개수 == 3 후자는 문자열 13335의 길이 == 5 이므로
        // "Invalid number" 출력

            else if (input.chars().distinct().count() == input.length())
            {
                char[] chars = input.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                System.out.println(sorted);
            }
            // 문자열( input )의 길이( .length() )가 != 5인것은 전의 if문에서 걸러짐 input.length() == 5는 필요 없음
            // 문자열( input )을 char형으로 변환( .char() ) 중복 제거( .distinct() ) 후의 char의 개수( .count() )가
            // 문자열( input )의 길이( .length() )와 같을 떄
            // 문자열( input )을 char 배열( chars )로 변환
            // char 배열( chars )을 순서대로 배열 ( Arrays.sort() )
            // 배열된 문자열을 변수명 ( sorted ) 으로 명명
            // 문자열 ( sorted ) 출력
    }
}
