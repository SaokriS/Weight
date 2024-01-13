import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Weight determination program");

        System.out.println("Enter the first weight:");
        double firstWeight = new Scanner(System.in).nextDouble();

        System.out.println("Enter the second weight:");
        double secondWeight = new Scanner(System.in).nextDouble();

        System.out.println("Enter the third weight:");
        double thirdWeight = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        if (firstWeight > secondWeight && firstWeight > thirdWeight ) {
            greatest = firstWeight;
        } else if (firstWeight < secondWeight && firstWeight < thirdWeight ) {
            smallest = firstWeight;
        } else {
            average = firstWeight;
        }

        if (secondWeight > firstWeight && secondWeight > thirdWeight ) {
            greatest = secondWeight;
        } else if (secondWeight < firstWeight && secondWeight < thirdWeight ) {
            smallest = secondWeight;
        } else {
            average = secondWeight;
        }

        if (thirdWeight  > firstWeight && thirdWeight > secondWeight) {
            greatest = thirdWeight;
        } else if (thirdWeight < secondWeight && thirdWeight < firstWeight) {
            smallest = thirdWeight;
        } else {
            average = thirdWeight;
        }


        System.out.println("The highest weight: " + greatest);
        System.out.println("Average weight: " + average);
        System.out.println("The lowest weight: " + smallest);

    }
}