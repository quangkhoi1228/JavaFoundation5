package class10;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mở 1 follow để lấy input từ bàn phím người dùng

//        System.out.print("Vui lòng nhập: ");
//        String userInput = scanner.nextLine();
//        System.out.println("User vừa nhập: " + userInput);
//
//
//        System.out.print("Tuổi bạn là gì: ");
//        int age = scanner.nextInt();
//        System.out.println("Tuổi của bạn: " + age);


        String rank = "bạc"; // không

        System.out.print("Bạn rank gì: ");
        // có | không
        String userRankInput = scanner.nextLine();

        if (userRankInput.equals(rank)) {
            System.out.println("Bạn nói thật ");
        } else {
            System.out.println("Bạn nói xạo ");
        }

        // x. điều kiện while | do-while


    }
}
