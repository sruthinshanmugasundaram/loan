DROP TABLE IF EXISTS Loan;
CREATE TABLE Loan (
    loan_number INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    customer_id INT NOT NULL,
    contact VARCHAR(13) NOT NULL,
    loan_type VARCHAR(50) NOT NULL,
    loan_account_number VARCHAR(15) NOT NULL,
    loan_amount INT NOT NULL,
    emi_account VARCHAR(50) NOT NULL,
    loan_end_date DATE DEFAULT CURDATE() + 1, 
    interest_rate DOUBLE NOT NULL
);
INSERT INTO Loan (name, customer_id, contact, loan_type, loan_account_number, loan_amount, emi_account, loan_end_date, interest_rate) VALUES 
('sruthin1', 12345, '1234567890', 'Home Loan', 'L-123', 50000, 'E-001', CURDATE()+1000, 4.5),
('sruthin2', 67890, '9876543210', 'Car Loan', 'L-456', 30000, 'E-002', CURDATE()+1000, 5.0),
('sruthin3', 54321, '7654567845', 'Personal Loan', 'L-789', 75000, 'E-003', CURDATE()+1000, 6.0),
('sruthin4', 1, '2345434543',  'HOUSING LOAN', 'L-012', 10000, 'E-004', CURDATE()+1000, 9.0),
('sruthin5', 1, '2345434543',  'VEHICLE LOAN', 'L-012', 50000, 'E-005', CURDATE()+100, 7.0),
('sruthin6', 2, '7654545454',  'HOUSING LOAN', 'L-012', 80000, 'E-006', CURDATE()+5000, 5.0),
('sruthin7', 2, '3434565676',  'PERSONAL LOAN', 'L-012', 7000, 'E-007', CURDATE()+10, 7.0);
