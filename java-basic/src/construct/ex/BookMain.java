package construct.ex;

public class BookMain {
    public static void main(String[] args){
//        기본 생성자 사용
        Book[] books = new Book[3];

        books[0] = new Book();
        books[1] = new Book("Hello, Java", "Seo");
        books[2] = new Book("JPA 프로그래밍", "Kim", 800);

        for (Book book: books){
            book.displayInfo();
        }
    }
}
