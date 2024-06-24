package class11;//package class10;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mở 1 follow để lấy input từ bàn phím người dùng

        System.out.print("Vui lòng nhập: ");
        String userInput = scanner.nextLine();
        System.out.println("User vừa nhập: " + userInput);


        System.out.print("Tuổi bạn là gì: ");
        String age = scanner.nextLine();
        System.out.println("Tuổi của bạn: " + age);
//        scanner.nextLine(); // ""

        String rank = "bạc"; // không

        System.out.print("Bạn rank gì: ");
        // có | không
        String userRankInput = scanner.nextLine(); // -> ""

        if (userRankInput.equals(rank)) {
            System.out.println("Bạn nói thật ");
        } else {
            System.out.println("Bạn nói xạo ");
        }

        // x. điều kiện while | do-while

        // nextLine -> String: Tôi là Khôi "enter"
        // nextInt | nextDouble: 123 "enter"  ->
        // 2 dòng:
        // 123
        // ""
        // nextLine()


    }
}

//

//public class JavaUserInput {
//    public static void main (String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        // mở 1 follow để lấy input từ người dùng
////
////        System.out.println("Vui Lòng nhập: ");
////
////        String userInput = scanner.nextLine();
////
////        System.out.println("User vừa nhập: " + userInput);
////
////
//////        System.out.print("Vui Lòng nhập tuổi: ");
//////
//////        int Age = scanner.nextInt();
//////
//////        System.out.println("Tuổi: " + Age);
////
////        String rank = "bạc"; // không
////
////        System.out.print("Bạn rank gì: ");
////        String userRankInput = scanner.nextLine();
////        // có | không
////
////
//////        if (userRankInput.equals(rank)) {
//////            System.out.println("Bạn nói thật ");
//////        } else {
//////            System.out.println("Đừng qua mặt của ta ");
//////        }
////
////        // x. điều kiện while | do-while
//
//    }
//}