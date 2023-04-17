package org.example.Java_study;

import java.util.ArrayList;
import java.util.Scanner;

public class April17 {
    public static void main(String[] args) {
        int counter = 0;
        ArrayList<String> result = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        while (counter < 5) {
            System.out.print("한자리 숫자를 입력하세요 : ");
            String a = s.nextLine();
            if (!result.contains(a)) {
                result.add(a);
            }
            counter++;
        }

        System.out.printf("저장된값은 %s입니다", result);
    }
}