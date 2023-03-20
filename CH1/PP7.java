package CH1;

public class PP7 {
    public static void main(String[] args) {
        int seconds = 50391 % 60;
        int minutes = (50391 / 60) % 60;
        int hour = (50391 / 60) / 60;

        System.out.println(hour + "  hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
