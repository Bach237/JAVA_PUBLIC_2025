package Buoi6;

public class Book {
    private static int bookId = 1;
    private int iD;
    private String title;
    private String author;
    private int price;
    private Publisher publisher;

    public Book(String title, String author, int price, Publisher publisher) {
        this.iD = bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, int price) {
        this.iD = bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher();
    }

    public int getBookId() {
        return this.iD;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void displayInfo() {
        System.out.println("══════════════════════════════════");
        System.out.println("📖 MÃ SÁCH    : " + this.iD);
        System.out.println("📕 TIÊU ĐỀ    : " + this.title);
        System.out.println("✍️  TÁC GIẢ   : " + this.author);
        System.out.println("💰 GIÁ SÁCH   : " + this.price + " VNĐ");
        System.out.println("══════════════════════════════════");
    }

    public void displayInfo(boolean showPublisher) {
        System.out.println("══════════════════════════════════");
        System.out.println("📖 MÃ SÁCH    : " + this.iD);
        System.out.println("📕 TIÊU ĐỀ    : " + this.title);
        System.out.println("✍️  TÁC GIẢ   : " + this.author);
        System.out.println("💰 GIÁ SÁCH   : " + this.price + " VNĐ");
        if (showPublisher) {
            System.out.println("🏢 NHÀ XUẤT BẢN:");
            System.out.println("   • Tên    : " + publisher.getName());
            System.out.println("   • Địa chỉ: " + publisher.getAddress());
        } else {
            System.out.println("🏢 NHÀ XUẤT BẢN: Chưa rõ");
        }
        System.out.println("══════════════════════════════════");
    }


}
