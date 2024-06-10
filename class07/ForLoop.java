package class07;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");


        String[] names = new String[3];
        names[0] = "Khôi";
        names[1] = "Khoa";
        names[2] = "Duy";


        /**
         *
         * for nhận vào 3 biến
         * for(khởi_tạo_biến_trượt; điều_kiện_lặp; cập_nhật_biến trượt){
         *  // block code
         * }
         *
         *
         */
        for (int index = 0; index <= 2; index = index + 1) {
            System.out.println("Names: " + names[index]);
        }
        /**
         * Init
         * 0: khởi_tạo_biến_trượt : index = 0
         *
         * Lặp lần 1:
         * - Kiểm tra điều kiện: index <= 2 --> 0 <= 2 --> true
         * - Chạy khối code:
         *         System.out.println("Names: " + names[index]);
         *         <=>
         *         System.out.println("Names: " + names[0]);
         *         <=>
         *         Names: Khôi
         * - Cập nhật biến đếm: index = index + 1 = 0 + 1 = 1
         *
         * Lặp lần 2:
         * - Kiểm tra điều kiện: index <= 2 --> true
         * - Chạy khối code:
         *         System.out.println("Names: " + names[index]);
         *         <=>
         *         System.out.println("Names: " + names[1]);
         *         <=>
         *         Names: Khoa
         * - Cập nhật biến đếm: index = index + 1 = 1 + 1 = 2
         *
         *  Lặp lần 3:
         *  - Kiểm tra điều kiện: index <= 2 --> true
         *  - Chạy khối code:
         *          System.out.println("Names: " + names[index]);
         *          <=>
         *          System.out.println("Names: " + names[2]);
         *          <=>
         *          Names: Duy
         *  - Cập nhật biến đếm: index = index + 1 = 3
         *
         *  Lặp lần 4:
         *  - Kiểm tra điều kiện: index <= 2 --> false
         *  ==> kết thúc vòng lặp
         */




        /**
         * Bài toán: Lặp qua từng phần tử của biến names
         *  và in ra tên của từng phần tử
         *
         *
         *
         *  Ý tưởng: bắt đầu từ phần tử 0
         *  Lặp qua hết các phần tử
         *  mới mỗi lần lặp thì tăng lên 1 đơn vị
         *  lặp cho đến khi nào hết chiều dài của mảng
         *
         */
    }
}
