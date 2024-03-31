package ketola.quarkus.demo.application.example.resource.response;

import jakarta.validation.constraints.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record BookResponse(
    @NotNull
    @Schema
    String name
) {
}
