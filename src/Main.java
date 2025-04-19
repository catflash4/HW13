public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Братья", "Стругацкие");
        Author author3 = new Author("Стивен", "Кинг");
        Book book3 = new Book("КлаТбище домашних жЫвотных", author3,1983 );
        Book book1 = new Book("КлаТбище домашних жЫвотных", author1, 1983);
        Book book2 = new Book("Улитка на склоне", author2, 1966);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        book2.setPublicationYear(1968);
        System.out.println("Год издания " + book2.getPublicationYear());
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println(book1.getBookName().equals(book3.getBookName()));
        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(author1.equals(author3));
    }
}