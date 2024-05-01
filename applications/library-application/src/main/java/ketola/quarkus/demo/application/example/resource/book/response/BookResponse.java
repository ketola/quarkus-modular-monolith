package ketola.quarkus.demo.application.example.resource.book.response;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record BookResponse(

    @NotNull
    @Schema
    UUID id,

    @NotNull
    @Schema
    String name
) {
}
