package class03;

public class JavaArray {
    public static void main(String[] args) {

        System.out.println("Java Array");


        int khoiAge = 27;
        int duyAge = 18;
        int khoaAge = 18;

        int[] memberAge = new int[3];

        memberAge[0] = khoiAge;
        memberAge[1] = duyAge;
        memberAge[2] = khoaAge;


        int first = memberAge[0];
        int second = memberAge[1];
        int third = memberAge[2];

        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);


        System.out.println("Kích thước: " + memberAge.length);


        int[] memberAge1 = {30, 15, 10};

//        System.out.println("first: " + memberAge1[0]);
//        System.out.println("second: " + memberAge1[1]);
//        System.out.println("third: " + memberAge1[2]);
        System.out.println("Kích thước: " + memberAge1.length);


    }
}
