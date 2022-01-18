package jan18.Ex107;

public class Account_Example {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: "+account.getBalance());

        try{
            account.withdraw(30000);
        } catch (BalanceInsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
https://docs.oracle.com/en/java/javase/11/docs/api/