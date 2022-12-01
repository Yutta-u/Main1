public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();

        book.name = "Dark in the sky.";
        book.pages = 231;
        book.chapter = 13;
        book1.name = "Little Prince.";
        book1.pages = 128;
        book1.chapter = 7;

        System.out.println("Title of this book: " + book.name);
        System.out.println("Number of pages and chapters: " + "Pages " + book.pages + " Chapter: " + book.chapter);
        System.out.println();
        System.out.println("Title of this book: " + book1.name);
        System.out.println("Number of pages and chapters: " + "Pages " + book1.pages + " Chapter: " + book1.chapter);
        System.out.println();
        System.out.println("Are books equal in number of pages?: " + book.equals(book1));
    }
}
