package class08;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        /**
         * Cho phép người dùng nhập từ bàn phím 1 con số N,
         * tính tổng từ số 1 -> N
         * Sau đó, in ra màn hình kết quả
         * 1. dùng for để tính tổng
         * 2. kiểm tra người dùng có nhập đúng yêu cầu không?
         * Nếu không thì báo lỗi và cho nhập lại.
         */


        Scanner scanner = new Scanner(System.in);


        // kiễm tra nhập liệu cho đến khi nào đúng thì mới cho chạy tiếp

        boolean isNumberValid = false; // flag

        do {
            System.out.print("Nhập số: ");
            isNumberValid = scanner.hasNextInt();

            if (!isNumberValid) {
                scanner.next();
            }

        } while (!isNumberValid);


        int number = scanner.nextInt(); // N

        // Crash app --> stop
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

    }
}
