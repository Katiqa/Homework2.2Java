public class BmiService {
    public int calculate(double body_m, int mass_kg) {;
        double index = mass_kg / (body_m*body_m);
        return (int)index;
    }
}