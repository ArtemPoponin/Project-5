public class Main {
    public static void main(String[] args) {
        int balance = 100;
        long bonus;
        long balanceReplenishment = 1190;
        if (balanceReplenishment > 1000){
            bonus = balanceReplenishment/100;
        } else {
            bonus = 0;
        }
        long Balance = balance + balanceReplenishment + bonus;
        System.out.println(Balance);

    }
}
