package class09;

public class JavaMethod {

    public static int sum(int soDauTien, int soThuHai) {
        return soDauTien + soThuHai;
    }

    public static int sum(int soDauTien, int soThuHai, int soThuBa) {
        return soDauTien + soThuHai + soThuBa;
    }

    public static int sum(int soDauTien, int soThuHai, int soThuBa,
                          int soThuTu) {
        return soDauTien + soThuHai + soThuBa + soThuTu;
    }

    public static void listing(int n) {
        // 5: 0 1 2 3 4 5

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static int tinhGiaiThua(int n) {
        // 4
        // 4 * (3 * 2 * 1) <=> 4 * tinhGiaiThua(3)
        // tinhGiaiThua(3) = 3 * 2 * 1 <=> 3 * (2 * 1) <=> 3 * tinhGiaiThua(2)
        if (n == 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    }

    // function
    public static void main(String[] args) {

        /** modifier: public
         *  modifier return_type ten_ham(tham_so_1, tham_so_2){
         *  // khối code của hàm
         *  }
         */
        int soA = 1;
        int soB = 2;
        int soC = 3;
        int soD = 4;

        // lời gọi hàm
        int result = sum(soA, soB,
                soC, soD);
        System.out.println(result);

        listing(5);
        listing(10);
        listing(15);

        // 4! = 4 * 3 * 2 * 1


        int giaiThua = tinhGiaiThua(10);
        System.out.println(giaiThua);

    }
}
