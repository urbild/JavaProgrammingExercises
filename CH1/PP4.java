package CH1;

public class PP4 {
    public static void main(String[] args) {
        final double CONCENTRATION = 0.001;

        double mouseWeight = 0.020;
        double mouseDeath = 0.0000013;
        double ratioMouse = 0.0;

        double startingWeightDieter = 120.0;
        double desireWeightDieter = 90.0;

        double fatalSoda;

        ratioMouse = (mouseDeath/mouseWeight);
        fatalSoda = (desireWeightDieter/CONCENTRATION) * ratioMouse;

        System.out.println("Dieter can safely have up to " + fatalSoda + " liters od soda a day before dying.");
    }
}
