package ketola.quarkus.demo.application.example.resource.book.request;

import jakarta.validation.constraints.Size;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record AddBookRequest(
    @Schema
    @Size(min = 1, max = 50)
    String name

) {
}
