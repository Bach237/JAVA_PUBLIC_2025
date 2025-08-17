package Buoi6;

import java.util.Scanner;

public class Main2 {

    private static void hienThiMenu() {
        System.out.println("\n════════════════════════════════════════");
        System.out.println("               📚 MENU THƯ VIỆN          ");
        System.out.println("════════════════════════════════════════");
        System.out.println("1️⃣  Thêm sách vào thư viện");
        System.out.println("2️⃣  Hiển thị danh sách sách");
        System.out.println("3️⃣  Tìm sách theo tác giả");
        System.out.println("4️⃣  Xóa sách theo mã sách");
        System.out.println("5️⃣  Thoát chương trình");
        System.out.println("════════════════════════════════════════\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int so;
        do {
            hienThiMenu();
            System.out.print("👉 Mời bạn lựa chọn: ");
            so = sc.nextInt();
            sc.nextLine();

            if (so == 1) {
                System.out.print("✍️  Nhập tiêu đề sách: ");
                String tieuDe = sc.nextLine();
                System.out.print("✍️  Nhập tác giả: ");
                String tacGia = sc.nextLine();
                System.out.print("💰 Nhập giá sách: ");
                int giaSach = sc.nextInt();
                sc.nextLine();

                System.out.print("📌 Có nhập nhà xuất bản không (c/k)? ");
                char c = sc.nextLine().toLowerCase().charAt(0);
                if (c == 'c') {
                    System.out.print("🏢 Nhập tên nhà xuất bản: ");
                    String ten = sc.nextLine();
                    System.out.print("📍 Nhập địa chỉ: ");
                    String diaChi = sc.nextLine();
                    Book bookNew = new Book(tieuDe, tacGia, giaSach, new Publisher(ten, diaChi));
                    library.addBook(bookNew);
                } else {
                    Book bookNew = new Book(tieuDe, tacGia, giaSach);
                    library.addBook(bookNew);
                }
                System.out.println("✅ Đã thêm sách thành công!");

            } else if (so == 2) {
                System.out.print("📌 Có hiện nhà xuất bản không (c/k)? ");
                char c = sc.nextLine().toLowerCase().charAt(0);
                library.displayAllBooks(c == 'c');

            } else if (so == 3) {
                System.out.print("🔎 Nhập tác giả cần tìm: ");
                String author = sc.nextLine();
                library.searchByAuthor(author);

            } else if (so == 4) {
                System.out.print("🗑 Nhập mã sách cần xoá: ");
                int ID = sc.nextInt();
                sc.nextLine();
                library.removeBookById(ID);
            }

        } while (so != 5);

        System.out.println("👋 Chương trình kết thúc. Cảm ơn bạn đã sử dụng!");
        sc.close();
    }
}
