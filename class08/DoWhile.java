package class08;

public class DoWhile {


    public static void main(String[] args) {

        /**
         * do{
         * // khối code chạy 1 lần chạy khi điều kiện đúng
         * } while(điều_kiện)
         */


        int number = 10;

//        while(number <= 5){
//            System.out.println(number);
//            number += 1;
//        }

        do {
            System.out.println(number);
            number += 1;

        } while (number <= 5);


    }

    /**
     * Chạy khối code 1 lần:
     * - System.out.println(number); --> 1
     * - number += 1; --> 2
     *
     * Kiểm tra điều kiện: number <= 5 --> true
     * Chạy khối code:
     *  - System.out.println(number); --> 2
     *  - number += 1; --> 3
     *
     * Kiểm tra điều kiện: number <= 5 --> false
     * -> Thoát vòng lặp
     *
     *
     *
     */


}
