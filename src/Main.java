public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long creditpayment1years = service.calculate(12, 1000000);
        System.out.println(creditpayment1years);

        long creditpayment2years = service.calculate(24, 1000000);
        System.out.println(creditpayment2years);

        long creditpayment3years = service.calculate(36, 1000000);
        System.out.println(creditpayment3years);
        }
}
