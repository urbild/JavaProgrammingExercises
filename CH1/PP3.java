package CH1;
public class PP3 {
    public static void main(String[] args) {
        //pig latin names
        String first = "walt";
        String last = "savitch";
//        String newF = first.substring(1,2).toUpperCase() + first.substring(2) + first.charAt(0) + "ay";
//        String newL = last.substring(1,2).toUpperCase() + last.substring(2) + last.charAt(0) + "ay";
//        System.out.println();
        pigLatin(first);
        pigLatin(last);
    }
    public static void pigLatin(String name){
        String newName = name.substring(1,2).toUpperCase() + name.substring(2) + name.charAt(0) + "ay";
        System.out.println(newName);
    }
}
