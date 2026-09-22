import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Prompt the user and read a Fahrenheit temperature (double)
        System.out.println("Type Fahrenheit temperature. This will be read as a double. \n");
        double f = input.nextDouble();
        // TODO: Convert to Celsius using the formula above
        double c = (f - 32) * ((double) 5 /9);
        // TODO: Print both temperatures, formatted to 1 decimal place
        System.out.printf("Converted to Celsius: " + (int) c + "\n");
        // TODO (Part B): Print a clothing recommendation based on Celsius temp
        if (c >= 20) {
            System.out.println("Pretty hot. You should wear shorts and a t-shirt.");
        }
        else if (c >= 15){
            System.out.println("Pretty warm. You could wear a hoodie, a tshirt, and some trousers.");
            }
        else if (c >= 10) {
            System.out.println("A bit less than warm. You could wear a hoodie, a longsleeve, and some pants.");
        }
        else{
            System.out.println("Kinda getting cold. Wear a jacket, long sleeves, pants, and maybe even gloves, a hat, and a scarf");
        }
    }
}