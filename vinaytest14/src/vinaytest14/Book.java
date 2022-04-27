package vinaytest14;

public class Book {
	int bookId;
	String bookName;
	Author author;
	public Book(int bookId,String bookName, Author author) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.author=author;
	}
public void showDetails() {
	System.out.println("BookId:"+bookId+" "+"BookName:"+bookName);
	System.out.println("AuthorName:"+author.authorName+" "+"Author Age"+author.authorAge);
	}
public static void main(String[] args) {
	Author author=new Author("Vinay",21);
	Book book=new Book(1,"java",author);
    book.showDetails();
}
}
