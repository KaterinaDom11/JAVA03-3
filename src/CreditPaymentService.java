public class CreditPaymentService {
    public double calculate(double loanAmount, double loanTerm) {
        double numberOfPayments = loanTerm * 12;

        double monthlyPayment = (loanAmount * 0.008325) / (1 - Math.pow(1 + 0.008325, -numberOfPayments));

        return monthlyPayment;

    }
}

