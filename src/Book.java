public class Book {
    Book(String book_name, String author){
        this.author = author;
        this.book_name = book_name;
    }
    String book_name;
    String author;
    String getBook_name(){
        return book_name;
    }
    String getAuthor(){
        return author;
    }

    void Book_name(Book ...book_name){
        for(Book it: book_name){
            System.out.print(it.getBook_name()+ " ");
        }
    }

}
