package Buoi6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> arr = new ArrayList<>();

    public void addBook(Book book) {
        arr.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if (arr.isEmpty()) {
            System.out.println("📂 Thư viện hiện đang trống, chưa có sách nào.");
            return;
        }
        System.out.println("\n📚 DANH SÁCH SÁCH TRONG THƯ VIỆN:");
        System.out.println("════════════════════════════════════════");
        for (Book x : arr) {
            x.displayInfo(showPublisher);
        }
    }

    public void searchByAuthor(String author) {
        author = author.toLowerCase();
        boolean found = false;
        System.out.println("\n🔎 KẾT QUẢ TÌM KIẾM THEO TÁC GIẢ: " + author);
        System.out.println("════════════════════════════════════════");
        for (Book x : arr) {
            String s = x.getAuthor().toLowerCase();
            if (s.equals(author)) {
                x.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("⚠️ Không tìm thấy sách nào của tác giả \"" + author + "\".");
        }
    }

    public void removeBookById(int bookId) {
        boolean removed = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getBookId() == bookId) {
                arr.remove(i);
                System.out.println("✅ Đã xóa sách có mã bookId: " + bookId);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("⚠️ BookId không hợp lệ, không thể xóa.");
        }
    }
}
