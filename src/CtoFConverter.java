import java.util.Scanner;

void main() {
    Scanner in = new Scanner(System.in);

    double cVal = 0;
    double fVal = 0;
    boolean done = false;
    String trash = "";

    // F = C * 9.0/5.0 + 32.0

    do {

        IO.print("Enter the C value: ");

        if (in.hasNextDouble()) {
            cVal = in.nextDouble();
            fVal = cVal * 9.0 / 5.0 + 32.0;
            IO.println("The value " + cVal + " in Celsius is " + fVal + " in Fahrenheit!");
        } else {
            trash = in.nextLine();
            IO.println("You must enter a valid C value not: " + trash);
            IO.println("Try again");
        }
    } while (!done);
}