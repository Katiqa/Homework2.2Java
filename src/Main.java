public class Main {
    public static void main(String[] args) {
        BmiService calc = new BmiService();
        int fullIndex = calc.calculate(1.58, 53);
        System.out.println(fullIndex);
    }
}