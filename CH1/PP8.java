package CH1;

public class PP8 {
    //messy
    public static final double distance = 6.21;
    public static void main(String[] args) {
        double time,pace;
        System.out.println("This program calculates your pace given a time and distance traveled.");
        time = 35.5;/*35 minutes and 30 seconds*/
        pace = time / distance;
        System.out.println("Your pace is " + pace + " miles per hour");
    }
}
