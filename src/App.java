import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // A penny is worth 1 cent. A nickel is worth 5 cents. A dime is worth 10 cents. A quarter is worth 25 cents.
        // 100 cents = 1 dollar
        Scanner sc = new Scanner(System.in);

        PiggyBank bank1 = new PiggyBank();

        int menuChoice;

        do{
            System.out.print("1. Show total in bank.\n" + 
                                "2. Add a penny.\n" +
                                "3. Add a nickel.\n" + 
                                "4. Add a dime.\n" + 
                                "5. Add a quarter.\n" + 
                                "6. Take money out of bank.\n" +
                                "Enter 0 to quit\n" +
                                "Enter your choice: ");
            
            menuChoice = sc.nextInt();

            switch(menuChoice){
                case 1 ->{
                    bank1.showBankTotal();
                }
                case 2, 3, 4, 5->{
                    bank1.transaction(menuChoice);
                }
                case 6 ->{
                    bank1.takeMoneyOut();
                    clearScreen();
                }
                case 0 -> {}
                default ->{
                    System.out.println("Invalid input!");
                }
            }
            
        }while(menuChoice != 0);
        
        sc.close();
    }

    public static void clearScreen(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
