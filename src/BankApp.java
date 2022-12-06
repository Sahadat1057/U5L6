public class BankApp {
private int userAction;
    public BankApp() {
    }

    public void userAction(String choice) {
        choice.toLowerCase();
        if (choice.equals("choice 1")) userAction = 1;
        if (choice.equals("choice 2")) userAction = 2;
        if (choice.equals("choice 3")) userAction = 3;
        if (choice.equals("choice 4")) userAction = 4;
        if (choice.equals("choice 5")) userAction = 5;
        if (choice.equals("choice 6")) userAction = 6;
        if (choice.equals("choice 7")) userAction = 7;

        }

    public void choice1(BagelShop userBagelShop, CreditCard userCard) {
        if(userAction == 1) {
            userBagelShop.returnBagels( userCard, 100, "9254");
        }
    }

    public void choice2(CreditCard userCard){
        if(userAction == 2) {
            userCard.reduceBalance();
        }
    }

    public void choice3(CreditCard user)





    }

