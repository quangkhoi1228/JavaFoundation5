package class08;

public class While {
    public static void main(String[] args) {


        /**
         * while(điều_kiện){
         * //khối code này sẽ chạy khi điều_kiện = true
         *
         * }
         */

        // in số từ 1 -> 5
//        int number = 1;
//
//        while (number <= 5) {
//            System.out.println(number);
//            number = number + 1;
//        }
//
//
//
//        for(int number1 = 1; number1 <= 5; number1 = number1 +1 ){
//            System.out.println(number1);
//        }

        /**
         * Init: number = 1
         *
         * Lần 1;
         * Kiểm tra điều kiện: number <= 5 --> true
         * -> Chạy khối code
         *  - System.out.println(number) --> 1
         *  -  number = number + 1 --> 1 + 1 --> 2
         *  Lần 2;
         *  Kiểm tra điều kiện: number <= 5 --> true
         *  -> Chạy khối code
         *   - System.out.println(number) --> 2
         *   -  number = number + 1 --> 2 + 1 --> 3
         *   ...
         *  Lần 5;
         *   Kiểm tra điều kiện: number <= 5 --> true
         *   -> Chạy khối code
         *   - System.out.println(number) --> 5
         *   -  number = number + 1 --> 5 + 1 --> 6
         *   Lần 6;
         *    Kiểm tra điều kiện: number <= 5 --> false
         *    --> kết thúc
         */



        int sum = 0;
        int number = 1;

        while(number <= 10){
            sum = sum + number;
            number = number + 1;
        }

        System.out.println(sum);

        // number:                           1 -> 9
        // số được cộng vào sum: number + 1: 2 -> 10

        //               num: 1 + 2 -> 10 = đúng đáp số

    }
}
