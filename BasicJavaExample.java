public class BasicJavaExample {

    public static void main(String[] args) {
        int number = 5;
        String message = "This is a message.";
        displayNumber(number, message);
    }
  
    public static void displayNumber(int num, String msg) {
        System.out.println("The number is: " + num);
        System.out.println("Additional message: " + msg);
    }
}
