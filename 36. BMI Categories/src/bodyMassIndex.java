import java.util.Scanner;

public class bodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use metric system (metre and kilograms) or imperial measurements (feet and pound)?");
        System.out.println("Enter \"1\" for the metric system, \"2\" for the imperial measurements.");
        int choice = scanner.nextInt();

        double bmi = 0;

        if (choice == 1) {
            System.out.println("What's your height? Example: 1.82");
            double height = scanner.nextDouble();
            System.out.println("What is your weight? Example: 85");
            double weight = scanner.nextDouble();
            bmi = weight / (height * height);
        } else if (choice == 2){
            System.out.println("What's your height? Example: 62 (for 6'2\")");
            double height = scanner.nextDouble();
            System.out.println("What is your weight? Example: 170 (for 170lbs)");
            double weight = scanner.nextDouble();
            bmi = weight / (height * height) * 703;
        } else {
            System.out.println("Your input is invalid");
        }

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 15.0) {
            System.out.println("Very severely underweight.");
        } else if (bmi >= 15.0 && bmi <= 16.0) {
            System.out.println("Severely underweight.");
        } else if (bmi >= 16.1 && bmi <= 18.4) {
            System.out.println("Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight.");
        } else if (bmi >= 30.0 && bmi <= 34.9) {
            System.out.println("Moderately obese.");
        } else if (bmi >= 35.0 && bmi <= 39.9) {
            System.out.println("Severely obese.");
        } else if (bmi >= 40.0) {
            System.out.println("Morbidly obese.");
        }
    }
}
