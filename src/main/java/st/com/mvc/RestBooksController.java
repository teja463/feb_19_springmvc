package st.com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/books")
public class RestBooksController {
	List<Book> books = new ArrayList<Book>();
	
	public RestBooksController() {
		books.add( new Book("Spring in Action",1000));
		books.add( new Book("Hibernate in Action",860));
		books.add( new Book("jQuery in Action",550));
	}
	
	@RequestMapping
	public List<Book> listbooks() {
	     return books;
	}
	
	@RequestMapping("/{id}")
	public Book getBook(@PathVariable("id") int id) {
		if (id > books.size())
			 throw new BookNotFoundException();
		
		return books.get(id-1);
	}

	
	@RequestMapping( value = "/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") int id) {
            // delete book 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Book addBook(@RequestBody Book book) {
        // add book 
		return book;
	}
		
	

	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public  Error bookNotFound(BookNotFoundException e) {
	     return new Error(e.getMessage());
	}
	
	

}
