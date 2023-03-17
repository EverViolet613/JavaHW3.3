public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000;
        double y = 9.99 / 100 / 12;
        double interestRate = y;    // как сделать здесь красиво и не сломать логику?
        //double interestRate = 9.99 / 100 / 12;
        int creditPeriod = 12;

        int monthlyPayment = service.calculate(amountOfCredit, creditPeriod, interestRate);

        System.out.println("Ваш ежемесячный платеж:" + monthlyPayment + "руб.");

        System.out.println();
        System.out.println("1_000_000/24/9.99");
        System.out.println(service.calculate(1_000_000, 24, y)); //как заменить Y?

        System.out.println();
        System.out.println("1_000_000/36/9.99");
        System.out.println(service.calculate(1_000_000, 36, y));

    }

}
