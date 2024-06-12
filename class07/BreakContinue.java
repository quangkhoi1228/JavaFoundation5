package class07;

public class BreakContinue {
    public static void main(String[] args) {
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }


//        for (int i = 1; i <= 10; i++) {
//
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }



        String[] names = {"Khôi", "Khoa", "Duy"};
        for (int i = 0; i <= 2; i++) {

            if (names[i].equals("Khoa")) {
                continue;
            }
            System.out.println("Khen thưởng: " + names[i]);
        }


    }
}
