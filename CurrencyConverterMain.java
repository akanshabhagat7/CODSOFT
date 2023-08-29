import java.util.Scanner;

class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }
}

public class CurrencyConverterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine();

        // In a real application, you would fetch exchange rates from an API
        // For this example, I'm using a fixed exchange rate
        double exchangeRate = 1.18; // Example rate: 1 EUR to USD

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(exchangeRate);
        double convertedAmount = converter.convert(amount);

        System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}
