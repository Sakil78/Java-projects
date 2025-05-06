package calculator; // 📁 This program lives in a folder called "calculator"

public class Main {
    public static void main(String[] args) {
        // 🍬 STEP 1: Show the candy store's earnings!
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");   // 🫧 Money from bubblegum sales
        System.out.println("Toffee: $118");      // 🍬 Money from toffee sales
        System.out.println("Ice cream: $2250");  // 🍦 Money from ice cream
        System.out.println("Milk chocolate: $1680"); // 🍫 Chocolate profits
        System.out.println("Doughnut: $1075");   // 🍩 Doughnut earnings
        System.out.println("Pancake: $80");      // 🥞 Pancake income

        // 🧮 STEP 2: Add all the candy money together!
        double totalIncome = 202 + 118 + 2250 + 1680 + 1075 + 80;
        System.out.println("\nIncome: $" + totalIncome); // 💵 Total money earned

        // 🧾 STEP 3: Ask about expenses (money spent)
        Scanner scanner = new Scanner(System.in); // 📲 Our keyboard helper
        
        System.out.println("\nStaff expenses:");    // 💼 Money paid to workers
        double staffExpenses = scanner.nextDouble();
        
        System.out.println("Other expenses:");      // 🛠️ Money for supplies/repairs
        double otherExpenses = scanner.nextDouble();

        // 💸 STEP 4: Calculate profit!
        double netIncome = totalIncome - (staffExpenses + otherExpenses);
        System.out.println("Net income: $" + netIncome); // 🎉 Money left after costs
    }
}
