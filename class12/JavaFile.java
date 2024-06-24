package class12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaFile {
    public static void main(String[] args) {
//        File file = new File("example.txt");
//
//        if (file.exists()) {
//            System.out.println("File exists.");
//        } else {
//            System.out.println("File does not exist.");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên của bạn: ");
        String yourName = scanner.nextLine();
        System.out.print("Tuổi của bạn: ");
        String yourAge = scanner.nextLine();
        System.out.print("Giới tính của bạn: ");
        String yourGender = scanner.nextLine();

        System.out.println(
                "Tên: " + yourName +
                " Tuổi: " + yourAge +
                " Giới tính: " + yourGender);





        try (PrintWriter pw = new PrintWriter(new FileWriter("userinfo.txt"))) {
            pw.println( "Tên: " + yourName );
            pw.println( "Tuổi: " + yourAge);
            pw.println("Giới tính: " + yourGender);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
