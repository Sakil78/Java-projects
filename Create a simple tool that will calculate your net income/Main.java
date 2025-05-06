package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        double totalIncome = 202 + 118 + 2250 + 1680 + 1075 + 80;
        System.out.println();
        System.out.println("Income: $" + totalIncome);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();

        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();

        double netIncome = totalIncome - (staffExpenses + otherExpenses);

        System.out.println("Net income: $" + netIncome);
    }
}
