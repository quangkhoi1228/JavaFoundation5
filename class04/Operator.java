package class04;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Toán tử");

        int age = 21;
//        System.out.println(age);

        age += 3;
//        System.out.println(age);

        int dieuKien1 = 5;
        int dieuKien2 = 6;
        // result = false
/*
5:          0101
6:          0110
or
result =    0111 = 7








 */

        dieuKien1 |= dieuKien2;
        System.out.println("dieuKien1: " + dieuKien1);
        System.out.println("dieuKien2: " + dieuKien2);

        /*
           1. So sánh 2 số hạng bên trái và phải
           Của toán tữ &= với true
           ==> result

           2. Đem kết quả result gán lại cho số
           hạng bên trái


           & : AND
           Dk1      Dk2     result
           true  &  true    true
           true  &  false   false
           false &  true    false
           false &  false   false


           | : OR
            Dk1      Dk2     result
           true  &  true    true
           true  &  false   true
           false &  true    true
           false &  false   false


           1: true
           0: false


            XOR
         */


        int m = 5;
        int n = 10;
        boolean result = m > n; // So sánh m lớn hơn n

        System.out.println(result);


        // Toán tử logic
        int p = 5;
        int q = 10;
        boolean pMoreThan3 = p > 3;
        // true
        boolean qLessThan15 = q < 15;
        // true
        boolean condition1 = pMoreThan3 && qLessThan15;
        // true
//        & : AND
//        Dk1      Dk2     result
//        true  &  true    true
//        true  &  false   false
//        false &  true    false
//        false &  false   false


//        boolean condition1 = (p > 3) && (q < 15); // AND logic
//        boolean condition2 = (p > 3) || (q < 5); // OR logic
//        boolean condition3 = !(p > 3); // NOT logic

        boolean anhĐangHọc = true;

        boolean bạnẤyNghĩ = !anhĐangHọc;
        // ngược lại của anhĐangHọc = false

        System.out.println("anhĐangHọc: " + anhĐangHọc);
        System.out.println("bạnẤyNghĩ: " + bạnẤyNghĩ);


        if (!anhĐangHọc) {
            System.out.println("Có thể đi chơi");
        }


    }

}
