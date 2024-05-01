package ketola.quarkus.demo.application.example.resource.loan.response;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import ketola.quarkus.demo.application.example.resource.book.response.BookResponse;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record LoanResponse(
    @NotNull
    @Schema
    UUID id,

    @NotNull
    @Schema
    BookResponse book,

    @NotNull
    @Schema
    UUID userId
) {
}
