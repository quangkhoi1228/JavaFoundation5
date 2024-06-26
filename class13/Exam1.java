package class13;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Id: ");
        String id = scanner.nextLine();
        // ""  | "            "  -> trim()  "            "  -> ""     | "    abc   "  -> "abc"

        while (id.trim().equals("")) {
            System.out.print("Nhập lại: ");
            id = scanner.nextLine();
        }




//        System.out.print("Name: ");
//        String memberName = scanner.nextLine();
//
//        System.out.print("Address: ");
//        String address = scanner.nextLine();
//
//        System.out.print("Phone: ");
//        String phone = scanner.nextLine();
//
//        System.out.print("Member type: ");
//        String memberType = scanner.nextLine();

    }
}
