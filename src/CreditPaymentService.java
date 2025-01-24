public class CreditPaymentService {
    public double calculate(double loanAmount, double interestRate, double loanTerm) {
        double numberOfPayments = loanTerm * 12;
        double monthlyRate = interestRate / 100 / 12;
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));

        return monthlyPayment;

    }
}

