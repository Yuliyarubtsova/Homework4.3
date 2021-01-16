public class CreditPaymentService {
    public long calculate(int mounths, long amounth) {
        double percent = 0.0999 / 12;
        double coefficient = (percent * StrictMath.pow ((1 + percent), mounths)) / (StrictMath.pow(( 1 + percent ),  mounths) - 1);
        long creditpayment = (long) (coefficient * amounth);
        return creditpayment;
    }
}
