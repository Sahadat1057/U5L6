import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //New bank in town
       /* Bank bank = new Bank();
        System.out.println(bank + "\n");

        //Mr. Das is getting a new credit card!
        CreditCard myCard = new CreditCard("Mr. Das", "9254");
        System.out.println(myCard + "\n");

        //Oh nice! A new bagel shop in town!
        BagelShop jimsBagelShop = new BagelShop("Jim's Bagel Shop", 1000, 2, bank);
        System.out.println(jimsBagelShop + "\n");

        //Mr. Das wants to buy 5 bagels using his new credit card
        boolean buyBagels = jimsBagelShop.payForBagels(myCard, 5, "9254");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard + "\n");
        System.out.println(jimsBagelShop + "\n");

        //He tried to buy 10 more, but accidentally entered his PIN wrong
        buyBagels = jimsBagelShop.payForBagels(myCard, 10, "9354");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard + "\n");
        System.out.println(jimsBagelShop + "\n");

        //He fixed his typo!  Phew thank goodness
        buyBagels = jimsBagelShop.payForBagels(myCard, 10, "9254");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard + "\n");
        System.out.println(jimsBagelShop + "\n");

        //Three of his bagels are moldy; he returns them for his money back
        boolean returnBagels = jimsBagelShop.returnBagels(myCard, 3, "9254");
        System.out.println(returnBagels + "\n");
        System.out.println(myCard + "\n");
        System.out.println(jimsBagelShop + "\n");

        //Bill time!  Mr. Das pays off $15
        bank.makePayment(myCard, 15);
        System.out.println(myCard + "\n");
        System.out.println(bank + "\n");

        //John opens a new Credit Card
        CreditCard johnsCard = new CreditCard("John", "1022");
        System.out.println(johnsCard + "\n");

        //John is catering a large breakfast at a conference center
        buyBagels = jimsBagelShop.payForBagels(johnsCard, 300, "1022");
        System.out.println(buyBagels + "\n");
        System.out.println(johnsCard + "\n");
        System.out.println(jimsBagelShop + "\n");

        //Yikes! That was expensive. John pays off $75 of his credit card balance
        bank.makePayment(johnsCard, 75);
        System.out.println(johnsCard + "\n");
        System.out.println(bank + "\n");

        //The bagel shop has a lot of money and wants to deposit the profits into the bank
        jimsBagelShop.depositProfits();
        System.out.println(jimsBagelShop + "\n");
        System.out.println(bank + "\n");

        //Let's see whose credit card balance is lower!
        CreditCard lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null)
        {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        }
        else
        {
            System.out.println("They have the same balance\n");
        }

        //John pays off his card in full
        bank.makePayment(johnsCard, johnsCard.getBalanceOwed());
        System.out.println(johnsCard + "\n");
        System.out.println(bank + "\n");

        //Now let's check again:
        lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null)
        {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        }
        else
        {
            System.out.println("They have the same balance\n");
        }

        //Mr. Das pays off his card in full
        bank.makePayment(myCard, myCard.getBalanceOwed());
        System.out.println(myCard + "\n");
        System.out.println(bank + "\n");

        //Now let's check one last time:
        lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null)
        {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        }
        else
        {
            System.out.println("They have the same balance\n");

        */


        Scanner s = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = s.nextLine();
        System.out.println("");

        CreditCard userCard = new CreditCard(name, "9254");
        Bank userBank = new Bank();
        BagelShop userBagelShop = new BagelShop(name + "'s Bagel Shop", 100, 1, userBank);
        BankApp userBankApp = new BankApp();

        System.out.println("These are the actions you can take (as a customer): ");

        System.out.println("Choice 1: Make a purchase or return bagels at the bagel shop");
        System.out.println("Choice 2: Make a payment on the credit card");
        System.out.println("Choice 3: Open a second credit card");
        System.out.println("Choice 4: Compare credit card balances");
        System.out.println("");
        System.out.println("As a bagel owner you can take these actions: ");
        System.out.println("Choice 5: Deposit profits into the bank ");
        System.out.println("Choice 6: Check Inventory");
        System.out.println("What action would you like to take?");
        String choice = s.nextLine();
        userBankApp.userAction(choice);





    }

    }



