public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(52, 1.65);
        System.out.println(bodyMassIndex);
    }


}
