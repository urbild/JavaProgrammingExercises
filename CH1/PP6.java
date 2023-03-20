package CH1;

public class PP6 {
    public static void main(String[] args) {
        final double PI = 3.14;

        double speed = 0.0; // mph
        int gearSize = 100; //inches
        int cadence = 90; //rpm

        speed = gearSize * PI * (1.0/12.0) * (1.0/5280.0) * cadence * 60.0;

        System.out.println("Speed: " + speed);
    }
}
