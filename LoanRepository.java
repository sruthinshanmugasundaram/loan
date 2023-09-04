package in.bank.loan.controller;
import in.bank.loan.models.Loan;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
	static List<Loan> findByCustomerId(int customerId) {
		return null;
	}
}
