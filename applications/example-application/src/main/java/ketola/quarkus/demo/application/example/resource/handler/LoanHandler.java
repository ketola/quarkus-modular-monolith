package ketola.quarkus.demo.application.example.resource.handler;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import ketola.quarkus.demo.application.example.resource.response.LoanResponse;
import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor
public class LoanHandler {

    public List<LoanResponse> getLoans(){
        return List.of(new LoanResponse("Loan 1"), new LoanResponse("Loan 2"));
    }
}
