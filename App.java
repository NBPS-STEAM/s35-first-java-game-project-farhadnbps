import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Loading...10% complete");
        Thread.sleep(500);
        System.out.println("Loading...50% complete");
        Thread.sleep(500);
        System.out.println("Loading...90% complete");
        Thread.sleep(500);
        System.out.println("Loading...99% complete");
        Thread.sleep(1000);
        System.out.println("Loading...100% complete");
        Thread.sleep(500);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Let's start the game, " + name + "!");
    }
}