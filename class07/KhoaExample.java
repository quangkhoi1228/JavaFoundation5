package class07;

import java.util.Scanner;

public class KhoaExample {
    public static void main(String[] args) {


//        int so = 1;
//
//        for (int sum = 0; so <= 10; so = so + 1) {
//            sum = sum + so;
//            System.out.println("Number: " + sum);
//        }


        // Tính tổng các số 1 đến n với n là số nguyên được nhập từ bàn phím
        // flag : cờ
        //  1 -> 10   currentNumber = index
        //  0 -> 9    currentNumber = index + 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

//        for (int index = 0; index < n; index = index + 1) {




















        int sum = 0;

        for (int index = 0; index < n; index = index + 1) {
            int currentNumber = index + 1;
            sum = sum + currentNumber;
        }

        System.out.println("Number: " + sum);












        /**
         * Init: int sum = 1 => sum = 1
         *
         * Chạy lần 1:
         * - so sánh điều kiện:  sum <= 10 ==> true
         * - Chạy khối code:
         */


    }
}
