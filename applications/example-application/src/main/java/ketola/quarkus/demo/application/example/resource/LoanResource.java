package ketola.quarkus.demo.application.example.resource;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.handler.LoanHandler;
import ketola.quarkus.demo.application.example.resource.response.LoanResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@Path("/loans")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "example-loan", description = "Loan")
@AllArgsConstructor
@Slf4j
public class LoanResource {

        private LoanHandler loanHandler;

        @GET
        @Path("/")
        @Operation(summary = "Loans")
        public List<LoanResponse> getLoans() {
            return loanHandler.getLoans();
        }



}
