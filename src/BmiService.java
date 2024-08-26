public class BmiService {
    public int calculate(double heightMetre, double weightKg) {
        return (int) (weightKg / Math.pow(heightMetre, 2));
    }
}
