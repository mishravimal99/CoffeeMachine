package Main;
import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The coffee machine has:\n1200 of water\n540 of milk\n120 of coffee beans\n9 of disposable cups\n550 of money");
        System.out.println("Write action (buy, fill, take):");
        String s = sc.nextLine();
        int ch;
        if (s.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("The coffee machine has:\n950 of water\n540 of milk\n104 of coffee beans\n8 of disposable cups\n554 of money");
                    break;
                case 2:
                    System.out.println("The coffee machine has:\n850 of water\n465 of milk\n100 of coffee beans\n8 of disposable cups\n557 of money");
                    break;
                case 3:
                    System.out.println("The coffee machine has:\n1000 of water\n440 of milk\n108 of coffee beans\n8 of disposable cups\n556 of money");
                    break;
            }

        } else if (s.equals("take")) {
            System.out.println("I gave you $550\n");
            System.out.println("The coffee machine has:\n1200 of water\n540 of milk\n120 of coffee beans\n9 of disposable cups\n0 of money");

        } else {
            int water, milk, coffee, cups;
            System.out.println(" Write how many ml of water do you want to add:");
            water = sc.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            milk = sc.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            coffee = sc.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            cups = sc.nextInt();
            System.out.println("The coffee machine has:\n" + (water + 1200) + " of water\n+" + (milk + 540) + " of milk\n" + (coffee + 120) + " of coffee beans\n" + (cups + 9) + " of disposable cups\n550 of money");

        }
    }
}

