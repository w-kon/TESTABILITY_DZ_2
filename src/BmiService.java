public class BmiService {
    public double calculate(double heightMetre, double weightKg){
        return (int)(weightKg/Math.pow(heightMetre, 2));
    }
}
