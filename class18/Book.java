package class18;

public class Book {
    private String title;
    private String author;
    private long pages;
    private long rentalPricePerPage;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPages() {
        return this.pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public long getRentalPricePerPage() {
        return this.rentalPricePerPage;
    }

    public void setRentalPricePerPage(long rentalPricePerPage) {
        this.rentalPricePerPage = pages;
    }


    // Overloading
    public long caculateRentalPrice() {
        long rentalPrice = this.rentalPricePerPage * this.pages;
        return rentalPrice;
    }

    // Cho phép nhập vào số ngày cần thuê --> Tính tiền
    public long caculateRentalPrice(int rentalDateCount) {
        long rentalPrice = rentalDateCount *
                this.rentalPricePerPage * this.pages;
        return rentalPrice;
    }

}
