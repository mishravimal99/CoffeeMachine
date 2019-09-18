package machine;

import java.util.Scanner;

class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = 1200;//water
        int milk = 540; //milk
        int coffee = 120;//coffee beans
        int cups = 9;//disposable cups
        int money = 550;// money
        int n = 9;
        while (n > 0) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String s = sc.nextLine();
            if (s.equals("exit"))
                n = 0;
            String ch;
            if (s.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                ch = sc.nextLine();
                int choice = 0;
                if (ch.equals("1"))
                    choice = 1;
                else if (ch.equals("2"))
                    choice = 2;
                else if (ch.equals("3"))
                    choice = 3;
                else if (ch.equals("back"))
                    choice = 4;

                switch (choice) {
                    case 1:
                        if ((water > 250) && (coffee > 16)) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 250;
                            coffee = coffee - 16;
                            money = money + 4;
                        } else if ((water < 250) && (coffee > 16))
                            System.out.println("Sorry, not enough water!");
                        else if ((water > 250) && (coffee < 16))
                            System.out.println("Sorry, not enough coffee beans!");
                        else
                            System.out.println("Sorry, not enough water and coffee beans!");
                        break;
                    case 2:
                        if ((water > 350) && (coffee > 20) && (milk > 75)) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 350;
                            coffee = coffee - 20;
                            milk = milk - 75;
                            money = money + 7;
                        } else if ((water < 350) && (coffee > 20) && (milk > 75))
                            System.out.println("Sorry, not enough water!");
                        else if ((water > 350) && (coffee < 20) && (milk > 75))
                            System.out.println("Sorry, not enough coffee beans!");
                        else if ((water > 350) && (coffee > 20) && (milk < 75))
                            System.out.println("Sorry, not enough milk!");
                        else if ((water < 350) && (coffee < 20) && (milk > 75))
                            System.out.println("Sorry, not enough water and coffee beans!");
                        else if ((water < 350) && (coffee > 20) && (milk < 75))
                            System.out.println("Sorry, not enough water and milk!");
                        else if ((water > 350) && (coffee < 20) && (milk < 75))
                            System.out.println("Sorry, not enough milk and coffee beans!");
                        else
                            System.out.println("Sorry, not have water, coffee beans and milk!");
                        break;
                    case 3:
                        if ((water > 200) && (coffee > 12) && (milk > 100)) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 200;
                            coffee = coffee - 12;
                            milk = milk - 100;
                            money = money + 6;
                        } else if ((water < 200) && (coffee > 12) && (milk > 100))
                            System.out.println("Sorry, not enough water!");
                        else if ((water > 200) && (coffee < 12) && (milk > 100))
                            System.out.println("Sorry, not enough coffee beans!");
                        else if ((water > 200) && (coffee > 12) && (milk < 100))
                            System.out.println("Sorry, not enough milk!");
                        else if ((water < 200) && (coffee < 12) && (milk > 100))
                            System.out.println("Sorry, not enough water and coffee beans!");
                        else if ((water < 200) && (coffee > 12) && (milk < 100))
                            System.out.println("Sorry, not enough water and milk!");
                        else if ((water > 200) && (coffee < 12) && (milk < 100))
                            System.out.println("Sorry, not enough milk and coffee beans!");
                        else
                            System.out.println("Sorry, not have water, coffee beans and milk!");
                        break;
                    case 4:
                        break;
                }

            } else if (s.equals("take")) {
                System.out.println("I gave you $" + money + "\n");
                money = 0;

            } else if (s.equals("fill")) {
                int water1, milk1, coffee1, cups1;
                System.out.println(" Write how many ml of water do you want to add:");
                water1 = sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                milk1 = sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                coffee1 = sc.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                cups1 = sc.nextInt();
                System.out.println("The coffee machine has:\n" + (water + water1) + " of water\n+" + (milk + milk1) + " of milk\n" + (coffee + coffee1) + " of coffee beans\n" + (cups + cups1) + " of disposable cups\n" + money + " of money");
            } else if (s.equals("remaining")) {
                System.out.println("The coffee machine has:\n" + water + " of water\n+" + milk + " of milk\n" + coffee + " of coffee beans\n" + cups + " of disposable cups\n" + money + " of money");
            } else
                n = 0;
        }
    }
}