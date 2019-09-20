import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if (n==0){
            System.out.println("N/A");
        }
        else {
            scanner.nextLine().trim();
            Book[] books = new Book[n];

            for(int i=0;i<n;i++){
                String bookName = scanner.nextLine().trim();
                String authorName = scanner.nextLine().trim();
                String isbn = scanner.nextLine().trim();
                books[i]=new Book(bookName,authorName,isbn);
            }
            for(int j=0;j<books.length;j++){
                System.out.println(books[j]);
            }
        }
    }
}
class Book{
    public String bookName;
    public String authorName;
    public String isbn;
    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getIsbn(){
        return isbn;
    }
    public Book(String bookName,String authorName,String isbn){
        this.bookName= bookName;
        this.authorName=authorName;
        this.isbn=isbn;
    }
    @Override
    public String toString(){
        return "-----------------------------\n"+
                "Book Name:\t"+getBookName()+
                "\nAuthor Name:\t"+getAuthorName()+
                "\nISBN:\t"+getIsbn()+
                "\n-----------------------------";
    }

}