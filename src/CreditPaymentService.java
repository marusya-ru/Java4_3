public class CreditPaymentService {
    public int calculate(double sum, double percent, int term) {
        double payment;
        double monthPercent = percent / 100 / 12;
        payment = sum * (monthPercent + monthPercent / (Math.pow((1 + monthPercent), term) - 1));
        return (int) payment;
    }
}
