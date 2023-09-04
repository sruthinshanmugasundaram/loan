package in.bank.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bank.loan.models.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    public LoanController(LoanRepository loanRepository) {
    }   

    @PostMapping
    public List<Loan> getLoanDetailsForCustomer(@RequestBody LoanRequest request) {
        try {
			return LoanRepository.findByCustomerId(request.getCustomerId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }

    
}
