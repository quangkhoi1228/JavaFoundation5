package class05;

public class IfElseCondition {
    public static void main(String[] args) {
        System.out.println("Điều kiện if else");
//
//        int age = 16;
//
//
//        if (age >= 20) {
//            System.out.println("Bạn đã đủ tuổi để lái xe.");
//        }
//        else {
//            System.out.println("Bạn không đủ tuổi để lái xe");
//        }


//        double scrore = 9.5;
//
//        if (scrore >= 5 && scrore < 7) {
//
//            System.out.println("Bạn đạt điểm khá");
//
//        } else if (scrore >= 7 && scrore < 9) {
//
//            System.out.println("Bạn đạt điểm giỏi");
//
//        } else if (scrore >= 9) {
//
//            System.out.println("Bạn đạt điểm xuất sắc");
//
//        } else {
//
//            System.out.println("Bạn đã trượt môn");
//
//        }


        int age = 16;

        /*
        boolean enoughToDrive;

        if (age >= 20) {
            enoughToDrive = true;
        } else {
            enoughToDrive = false;
        }
         */

        boolean enoughToDrive = (age >= 20) ? true : false;


        System.out.println("enoughToDrive: " + enoughToDrive);


        int year = 2020;
        System.out.println(year % 400 == 0 && year % 4 == 0 || year % 100 != 0);


    }
}
