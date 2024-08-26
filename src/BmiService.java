public class BmiService {
    public double calculate(double heightMetre, double weightKg) {
        return weightKg / Math.pow(heightMetre, 2);
    }
}
