package ketola.quarkus.demo.application.example.resource.loan;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.loan.request.AddLoanRequest;
import ketola.quarkus.demo.application.example.resource.loan.response.LoanResponse;
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

    private LoanRequestHandler loanRequestHandler;

    @GET
    @Path("/")
    @Operation(summary = "Loans")
    public List<LoanResponse> getLoans() {
        log.debug("getLoans()");
        return loanRequestHandler.getLoans();
    }

    @POST
    @Path("/")
    @Operation(summary = "Add a loan")
    public LoanResponse addLoan(@Valid AddLoanRequest addLoanRequest) {
        log.debug("addLoan(addLoanRequest = {})", addLoanRequest);
        return loanRequestHandler.addLoan(addLoanRequest);
    }

}
