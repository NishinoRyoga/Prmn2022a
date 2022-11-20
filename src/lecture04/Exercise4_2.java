package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "藤井智子";
        String number = "12345";

        atm.existsAccount(name,number);
        atm.registerAccount(name,number);
        atm.existsAccount(name,number);
        atm.deposit(number,1000);
        atm.withdraw(number,2000);
        atm.withdraw(number,500);
    }
}
