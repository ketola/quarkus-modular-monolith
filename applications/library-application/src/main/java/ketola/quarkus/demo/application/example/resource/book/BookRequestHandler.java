package ketola.quarkus.demo.application.example.resource.book;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.book.request.AddBookRequest;
import ketola.quarkus.demo.application.example.resource.book.response.BookResponse;
import ketola.quarkus.demo.service.book.BookService;
import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor
public class BookRequestHandler {
    BookService bookService;

    BookResponseMapper bookResponseMapper;

    public List<BookResponse> getBooks() {
        return bookService.findAllBooks().stream().map(bookResponseMapper::toBookResponse).toList();
    }

    public BookResponse createBook(AddBookRequest addBookRequest) {
        return bookResponseMapper.toBookResponse(bookService.addBook(addBookRequest.name()));
    }
}
