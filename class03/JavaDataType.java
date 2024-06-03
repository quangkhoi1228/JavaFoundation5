package class03;

public class JavaDataType {
    public static void main(String[] args) {

        System.out.println("Java Data Type");

        byte byteVar = -128;
        System.out.println(byteVar);


        int index = 1;

        long $$$OfDuy = 1000000000;

        double thapPhan = 500000.123;



        // Chuyển đổi kiểu dữ liệu

        // Ép kiểu lên
        int soInt = 100;
        System.out.println(soInt);

        long soLong = soInt;
        System.out.println(soLong);


        // Ép kiểu xuống
        long soLong1 = 10000;
        int soInt1 = (int) soLong1;

    }
}
