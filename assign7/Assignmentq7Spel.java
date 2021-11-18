package assign7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignmentq7Spel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring7.xml");
		BookLibrary library=(BookLibrary) context.getBean("bookLibrary");
		List<Book> allBooks=library.getAllBooks();
		for(Book book:allBooks)
		{
			System.out.println(book.getBookId()+"\t"+book.getBookName());
		}
		System.out.println("---------------------------");
		Book book=library.getGetFirstBook();
		System.out.println(book.getBookId()+"\t"+book.getBookName());
		
	}

}
