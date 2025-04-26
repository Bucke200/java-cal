import java.util.Scanner;

public class Calculator {
    public static void run(Scanner sc) {
        while (true) {
            System.out.println("=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Temperature Conversion");
            System.out.println("8. Currency Conversion");
            System.out.println("9. Back to Main Menu");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Result: " + (a + b));
                    break;
                case "2":
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Result: " + (a - b));
                    break;
                case "3":
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Result: " + (a * b));
                    break;
                case "4":
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    sc.nextLine();
                    if (b == 0) System.out.println("Cannot divide by zero.");
                    else System.out.println("Result: " + (a / b));
                    break;
                case "5":
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    sc.nextLine();
                    if (num < 0) System.out.println("Cannot take square root of negative number.");
                    else System.out.println("Result: " + Math.sqrt(num));
                    break;
                case "6":
                    System.out.print("Enter base and exponent: ");
                    double base = sc.nextDouble();
                    double exp = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;
                case "7":
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.print("Choose: ");
                    String tChoice = sc.nextLine();
                    if (tChoice.equals("1")) {
                        System.out.print("Enter Celsius: ");
                        double c = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Fahrenheit: " + (c * 9/5 + 32));
                    } else if (tChoice.equals("2")) {
                        System.out.print("Enter Fahrenheit: ");
                        double f = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Celsius: " + ((f - 32) * 5/9));
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case "8":
                    System.out.println("1. INR to USD");
                    System.out.println("2. USD to INR");
                    System.out.println("3. INR to EUR");
                    System.out.println("4. EUR to INR");
                    System.out.println("5. INR to GBP");
                    System.out.println("6. GBP to INR");
                    System.out.print("Choose: ");
                    String cChoice = sc.nextLine();
                    double inr, other;
                    double usdRate = 82.0, eurRate = 90.0, gbpRate = 100.0;
                    switch (cChoice) {
                        case "1":
                            System.out.print("Enter INR: ");
                            inr = sc.nextDouble(); sc.nextLine();
                            System.out.println("USD: " + (inr / usdRate));
                            break;
                        case "2":
                            System.out.print("Enter USD: ");
                            other = sc.nextDouble(); sc.nextLine();
                            System.out.println("INR: " + (other * usdRate));
                            break;
                        case "3":
                            System.out.print("Enter INR: ");
                            inr = sc.nextDouble(); sc.nextLine();
                            System.out.println("EUR: " + (inr / eurRate));
                            break;
                        case "4":
                            System.out.print("Enter EUR: ");
                            other = sc.nextDouble(); sc.nextLine();
                            System.out.println("INR: " + (other * eurRate));
                            break;
                        case "5":
                            System.out.print("Enter INR: ");
                            inr = sc.nextDouble(); sc.nextLine();
                            System.out.println("GBP: " + (inr / gbpRate));
                            break;
                        case "6":
                            System.out.print("Enter GBP: ");
                            other = sc.nextDouble(); sc.nextLine();
                            System.out.println("INR: " + (other * gbpRate));
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case "9":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
