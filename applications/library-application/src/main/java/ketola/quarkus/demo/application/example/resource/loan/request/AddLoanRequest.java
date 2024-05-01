package ketola.quarkus.demo.application.example.resource.loan.request;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record AddLoanRequest(
    @Schema
    @NotNull
    UUID bookId,

    @Schema
    @NotNull
    UUID userId
) {
}
