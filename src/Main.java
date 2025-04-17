public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Братья", "Стругацкие");
        Book book1 = new Book("КлаТбище домашних жЫвотных", author1, 1983);
        Book book2 = new Book("Улитка на склоне", author2, 1966);
        System.out.println("Книга: " + book1.getBookName() + "," + " автор: " + book1.getAuthor() + "," + " год издания: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getBookName() + "," + " автор: " + book2.getAuthor() + "," + " год издания: " + book2.getPublicationYear());
        book2.setPublicationYear(1968);
        System.out.println("Год издания " + book2.getPublicationYear());
        author2.setName("Аркадий и Борис");
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
    }
}