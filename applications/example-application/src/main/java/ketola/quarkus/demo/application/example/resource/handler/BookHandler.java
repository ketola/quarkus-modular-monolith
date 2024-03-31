package ketola.quarkus.demo.application.example.resource.handler;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.mapper.BookResponseMapper;
import ketola.quarkus.demo.application.example.resource.response.BookResponse;
import ketola.quarkus.demo.application.example.resource.response.LoanResponse;
import ketola.quarkus.demo.service.book.BookService;
import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor
public class BookHandler {

    BookService bookService;

    BookResponseMapper bookResponseMapper;

    public List<BookResponse> getBooks(){
        return bookService.findAllBooks().stream().map(bookResponseMapper::toBookResponse).toList();
    }
}
