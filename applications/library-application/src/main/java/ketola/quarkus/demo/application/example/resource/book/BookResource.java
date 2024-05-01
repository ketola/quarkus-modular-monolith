package ketola.quarkus.demo.application.example.resource.book;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.book.request.AddBookRequest;
import ketola.quarkus.demo.application.example.resource.book.response.BookResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "example-book", description = "Book")
@AllArgsConstructor
@Slf4j
@RunOnVirtualThread
public class BookResource {

    private BookRequestHandler bookRequestHandler;

    @GET
    @Path("/")
    @Operation(summary = "Books")
    public List<BookResponse> getBooks() {
        log.debug("getBooks()");
        return bookRequestHandler.getBooks();
    }

    @POST
    @Path("/")
    @Operation(summary = "Create book")
    public BookResponse addBook(@Valid AddBookRequest createBookRequest) {
        log.debug("addBook(createBookRequest = {})", createBookRequest);
        return bookRequestHandler.createBook(createBookRequest);
    }

}
