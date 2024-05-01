# Quarkus Modular Monolith

A base project for creating modular monolith architecture with Quarkus.

The project is divided into applications and services:

#### applications:

The applications could be backends for several frontend applications

- library-application
    - contains the http endpoints for the application

#### services:

The services can be used by multiple applications.

- book-service
    - BookService and database
- loan-service
    - LoanService and database

In addition there's a module called "quarkus" which is the root module for the project.

```mermaid
flowchart TD
    subgraph quarkus-modular-monolith
        subgraph applications
            subgraph library-application
                LoanResource
                BookResource
                LoanRequestHandler
                BookRequestHandler
            end

            LoanResource -.- LoanRequestHandler
            BookResource -.- BookRequestHandler
        end

        subgraph services
            subgraph loan-service
                LoanService
                LoanRepository
            end

            subgraph book-service
                BookService
                BookRepository
            end

            LoanRequestHandler -.- LoanService
            LoanRequestHandler -.- BookService
            BookRequestHandler -.- BookService
            LoanService -.- LoanRepository
            BookService -.- BookRepository
        end
    end

    subgraph databases
        loans[(loans)]
        books[(books)]
        BookRepository -.- books
        LoanRepository -.- loans
    end
```

### Running the application

To start the application locally, run the following command:
```mvn clean compile quarkus:dev```