package class09;

public class Excercise {
    public static int tinhTich(int soDauTien, int soThuHai) {
        return soDauTien * soThuHai;
    }

    public static void inChuoi(String chuoi) {
        System.out.println(chuoi);
    }

    public static int cong(int soA, int soB, int soC) {
        return soA + soB + soC;
    }

    public static double cong(double soA, double soB, double soC) {
        return soA + soB + soC;
    }

    public static int tinhTongDaySo(int n) {
        // n + (n-1) + ... + 1
        if (n == 1) {
            return 1;
        }
        return n + tinhTongDaySo(n - 1);

    }

    public static void main(String[] args) {

        int tich = tinhTich(4, 6);
        System.out.println(tich);


        inChuoi("Java Method");

        int result = cong(1, 2, 3);
        System.out.println(result);

        double resultDouble = cong(1.2, 2.3, 3.4);
        System.out.println(resultDouble);

        int tongDaySo  = tinhTongDaySo(10);
        System.out.println(tongDaySo);

    }
}
