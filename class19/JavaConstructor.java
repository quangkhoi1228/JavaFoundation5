package class19;

public class JavaConstructor {
    public static void main(String[] args) {
        Champion yasuo = new Champion();
        yasuo.setName("Yasuo");
        yasuo.setAD(56);
        yasuo.setAP(0);

        Champion riven = new Champion("Riven",
                70, 0);



        System.out.println("yasuo: " + yasuo.getName());
        System.out.println("riven: " + riven.getName());
    }
}
