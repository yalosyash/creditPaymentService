public class CreditPaymentService {
    public int calculate(int sum, int years) {
        int month = years * 12;
        float r = 9.99f / (100 * 12);
        double a = Math.pow(1 + r, month);
        return (int) (sum * ((r * a) / (a - 1)));
    }
}