import java.util.Scanner;

class login{
    int id =001;
    int PIN = 12345;
    double balance=10000.0;
    int amt;


    public void loginpage(){
        System.out.println("ENTER USER ID OF YOUR BANK: ");
        Scanner sc =new Scanner(System.in);
        int enteredID = sc.nextInt();

        System.out.println("ENTER PASSWORD: ");

        int enteredpiN = sc.nextInt();

        if(enteredID==id && enteredpiN==PIN){
            menu();
        }
        else {
            System.out.println("Enter the correct id and password");
            loginpage();
        }
    }

    public void menu(){
        System.out.println("1. TRANSACTION HISTORY");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. DEPOSIT MONEY");
        System.out.println("4. TRANSFER MONEY");
        System.out.println("5. QUIT");

        System.out.println("Enter your choice 1 , 2, 3, 4, 5");
        Scanner sc= new Scanner(System.in);
        int ch =sc.nextInt();

        if (ch==1){
            transhis();
        }
        else if(ch == 2 ){
            withd();
        }
        else if(ch == 3 ){
            depo();
        }
        else if(ch == 4){
            transmo();
        }
        else if(ch == 5 ){
            return;
        }

        else{
            System.out.println("PLEASE ENTER THE CORRECT CHOICE");
        }

    }
    public void transhis(){
        System.out.println("The Transaction history is ");
        System.out.println("CURRENT BALANCE "+balance);
        menu();
    }


    public void withd(){
        System.out.println("CURRENT BALANCE "+balance);
        System.out.println("Enter the amount u want to withdraw");
        Scanner sc =new Scanner(System.in);
        int amt= sc.nextInt();


        if (amt > balance){
            System.out.println("INSUFFICIENT BALANCE");
        }

        else {
            balance = balance - amt;
            System.out.println("money has been withdrawl");
            menu();
        }
    }


    public void  depo(){
        System.out.println("CURRENT BALANCE "+balance);
        System.out.println("Enter the amount u want to deposit");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        balance= balance+ amt ;
        System.out.println("Money deposited Sucessfully");

        System.out.println("Your currently balance is "+ balance);
        menu();
    }


    public void transmo(){
        System.out.println("CURRENT BALANCE "+balance);
        System.out.println("ENter the bank details you want to transfer");
        System.out.println("...........................................");
        System.out.println("ENter the account number of the reciever bank");
        Scanner sc = new Scanner(System.in);
        float recno = sc.nextFloat();
        System.out.println("ENter the account balance of the reciever bank");
        double recbal = sc.nextDouble();

        System.out.println("Enter the amount u want to transfer");
        float trans =sc.nextFloat();

        if ( balance > trans ){
            recbal =  recbal + trans ;
            System.out.println("Updated account baance is "+recbal);
        }
        else{
            System.out.println("Insufficient funds");
        }


        menu();
    }

}

public class Oasis_infobyte_T03_atm_interface
{
    public static void main (String args[]) {

        login obj =new login();
        obj.loginpage();
    }
}