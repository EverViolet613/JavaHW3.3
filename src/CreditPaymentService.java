public class CreditPaymentService {
    public int calculate(int amountOfCredit, int creditPeriod, double interestRate) {

        double x = Math.pow((1 + interestRate), -creditPeriod);

        return (int) (amountOfCredit * interestRate / (1 - x));
    }
}
