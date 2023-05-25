public class BmiService {
    public int calculate(double bodyM, int massKg) {

        double index = massKg / (bodyM * bodyM);
        return (int) index;
    }
}