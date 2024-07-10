package class18;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {

//
//        Book tiengViet1 = new Book();
//        tiengViet1.setTitle("Tiếng việt 1");
//        tiengViet1.setAuthor("Bộ giáo dục");
//        tiengViet1.setPages(100);
//
//        Book toan2 = new Book();
//        toan2.setTitle("Toán 2");
//        toan2.setAuthor("Bộ giáo dục");
//        toan2.setPages(50);
//
//        System.out.println(tiengViet1.getTitle());
//        System.out.println(tiengViet1.getAuthor());
//        System.out.println(tiengViet1.getPages());
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập Tiêu đề: ");
//        String bookTitleInput = scanner.nextLine();
//
//        System.out.print("Nhập Tác giả: ");
//        String bookAuthorInput = scanner.nextLine();
//
//        System.out.print("Nhập Số trang: ");
//        int bookPagesInput = scanner.nextInt();
//
//        System.out.println(
//                "Tiêu đề: " + bookTitleInput +
//                        "Tác giả: " + bookAuthorInput +
//                        "Số trang: " + bookPagesInput
//        );
//
//        Book userBook = new Book();
//        userBook.setTitle(bookTitleInput);
//        userBook.setAuthor(bookAuthorInput);
//        userBook.setPages(bookPagesInput);
//
//        System.out.println("User Book Tiêu đề " + userBook.getTitle());
//        System.out.println("User Book Tác giả " + userBook.getAuthor());
//        System.out.println("User Book Số trang " + userBook.getPages());


        /** Có 1 thư viện sách gồm nhiều quyền sách khác nhau
         * Mỗi quyển sách có:
         *  title, author, pages, rentalPricePerPage
         *
         * 1. Tính tiền thuê sách: rentalFee = rentalPricePerPage * pages
         *
         */


        Book tiengViet1 = new Book();
        tiengViet1.setTitle("Tiếng việt 1");
        tiengViet1.setAuthor("Bộ giáo dục");
        tiengViet1.setPages(100);
        tiengViet1.setRentalPricePerPage(
                200); // tiền thuê tiếng việt 1 cho 1 trang

        Book toan2 = new Book();
        toan2.setTitle("Toán 2");
        toan2.setAuthor("Bộ giáo dục");
        toan2.setPages(50);
        toan2.setRentalPricePerPage(300);

//        int tiengViet1RentalPrice = tiengViet1.getRentalPricePerPage() * tiengViet1.getPages();
//        int toan2RentalPrice = toan2.getRentalPricePerPage() * toan2.getPages();


        long tiengViet1RentalPrice = tiengViet1.caculateRentalPrice();
        long toan2RentalPrice = toan2.caculateRentalPrice(4);


        System.out.println("Giá thuê tiếng việt 1 " + tiengViet1RentalPrice);
        System.out.println("Giá thuê toán 2 " + toan2RentalPrice);


        // Cho phép tính giá thuê nhiều ngày
        // thuê 4 ngày ==> rentalDateCount = 4
        // rentalPrice = rentalDateCount * rentalPricePerPage * pages


    }
}
