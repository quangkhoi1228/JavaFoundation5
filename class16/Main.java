package class16;

public class Main {
    public static void main(String[] args) {
        /**
         * Tạo 2 tướng là yasuo và riven từ lớp Champion
         * Cho phép gán tên và gọi tên tướng
         */
        //KieuDuLieu tenBien  = Giatri
        String name = "Khánh Duy";


        Champion yasuo = new Champion();
        yasuo.name = "Yasuo";
        yasuo.number = 1;
        yasuo.sayMyName();

        Champion riven = new Champion();
        riven.name = "Riven";
        riven.number = 2;
        riven.sayMyName();


    }
}
