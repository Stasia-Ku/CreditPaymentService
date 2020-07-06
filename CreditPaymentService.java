public class CreditPaymentService {
    public int calculate (int sum, double percent, int years) {
        double P = percent/1200;
        int n = years*12;
        return  (int) (sum*(P+P/(Math.pow(1+P,n)-1)));
    }
}
