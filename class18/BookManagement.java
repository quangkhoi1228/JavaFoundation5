package class18;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {


        Book tiengViet1 = new Book();
        tiengViet1.setTitle("Tiếng việt 1");
        tiengViet1.setAuthor("Bộ giáo dục");
        tiengViet1.setPages(100);

        Book toan2 = new Book();
        toan2.setTitle("Toán 2");
        toan2.setAuthor("Bộ giáo dục");
        toan2.setPages(50);

        System.out.println(tiengViet1.getTitle());
        System.out.println(tiengViet1.getAuthor());
        System.out.println(tiengViet1.getPages());


        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Tiêu đề: ");
        String bookTitleInput = scanner.nextLine();

        System.out.print("Nhập Tác giả: ");
        String bookAuthorInput = scanner.nextLine();

        System.out.print("Nhập Số trang: ");
        int bookPagesInput = scanner.nextInt();

        System.out.println(
                "Tiêu đề: " + bookTitleInput +
                "Tác giả: " + bookAuthorInput +
                "Số trang: " + bookPagesInput
        );

        Book userBook = new Book();
        userBook.setTitle(bookTitleInput);
        userBook.setAuthor(bookAuthorInput);
        userBook.setPages(bookPagesInput);

        System.out.println("User Book Tiêu đề "+ userBook.getTitle());
        System.out.println("User Book Tác giả "+ userBook.getAuthor());
        System.out.println("User Book Số trang "+ userBook.getPages());



    }
}
