package in.bank.loan.models;

import lombok.Data;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_number")
    private int loanNumber;

    private String name;

    @Column(name = "customer_id")
    private int customerId;
    
    @Column(name = "contact")
    private String contact;
    
    @Column(name = "loan_type")
    private String loanType;
    
    @Column(name = "loan_account_number")
    private String loanAccountNumber;
    
    @Column(name = "loan_amount")
    private int loanAmt;

    @Column(name = "emi_account")
    private String emiAccount;

    @Column(name = "loan_end_date ")
    private Date loanEndDate;

    @Column(name = "interest_rate")
    private double interestRate;
}

