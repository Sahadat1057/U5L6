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

    public int choice1(BagelShop userBagelShop) {
        if(userAction == 1) {
            userBagelShop.returnBagels();
        }
    }





    }

