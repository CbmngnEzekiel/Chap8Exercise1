public class PiggyBank {
    private double cents;

    public void transaction(int choice){
        switch(choice){
            case 2 ->{
                addCurrency(1); // penny
            }
            case 3 ->{
                addCurrency(5); // nickel
            }
            case 4 ->{
                addCurrency(10); // dime
            }
            case 5 ->{
                addCurrency(25); // quarter
            }
            default ->{
                System.out.println("Invalid coin!");
            }
        }
        
        System.out.println("Success!");
    }

    private void addCurrency(double currency){
        this.cents += currency;
    }

    public void showBankTotal(){
        double dollarConversion = this.cents / 100;

        System.out.println("Balance ($): " + dollarConversion);
    }

    public void takeMoneyOut(){
        this.cents = 0;
        
        System.out.println("Success!");
    }
}
