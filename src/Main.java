public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Bmi = (int) service.calculate(1.87, 98);
        System.out.println(Bmi);
    }
}