package class05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SwitchCase {

    public static int sum(int soA, int soB){
        return soA + soB;
    }



    public static void main(String[] args) {
        System.out.println("Switch Case");


        /**
         *
         *
         *
         *
         */

//        int khoaAge = 20;
//
//        switch (khoaAge) {
//            case 12:
//                // khối code của case 17
//                System.out.println("Khoa đang học THCS");
//                break;
//            case 17:
//                // khối code của case 17
//                System.out.println("Khoa đang học THPT");
//                break;
//            default:
//                System.out.println("Trường hợp khác");
//                break;
//        }
//
//        if (khoaAge == 12) {
//            System.out.println("Khoa đang học THCS");
//        } else if (khoaAge == 17) {
//            System.out.println("Khoa đang học THPT");
//        } else {
//            System.out.println("Trường hợp khác");
//        }


        // 10/6/2024  --> Thứ 2

        Scanner scanner = new Scanner(System.in);

        // lấy ngày từ người dùng
        System.out.print("Vui lòng nhập ngày: ");
        String date = scanner.nextLine();

        // VN: dd/MM/yyyy : 10/6/2024 --> 2024/06/10
        // kiểu dữ liệu tên_biến
        // kiểu_dữ_liệu   tên_biến     = giá_trị
        int               soTienKhoa   = 110000;
        int               soTienDuy    = 100000;
        //------------------------------------------
        int               sumBill      = sum(soTienKhoa,soTienDuy);

        DateTimeFormatter formatter    = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate         standardDate = LocalDate.parse(date, formatter);
        DayOfWeek            dayOfWeek = standardDate.getDayOfWeek();

        String dayOfWeekResult;

        switch (dayOfWeek){
            case MONDAY:
                dayOfWeekResult = "Monday";
                break;
            case TUESDAY:
                dayOfWeekResult = "Tuesday";
                break;
            case WEDNESDAY:
                dayOfWeekResult = "Wednesday";
                break;
            default:
                dayOfWeekResult = "Sunday";
                break;
        }

        System.out.println("Ngày: " + date + " là thứ: " + dayOfWeekResult);
    }
//        System.out.println("Sum bill: " + sumBill);
}
