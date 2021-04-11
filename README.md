# Код программы:
```
public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int current_balance = 100;
        long bonus;
        long balance_replenishment = 1190;
        if (balance_replenishment >= 1000){
            bonus = balance_replenishment/100;
        } else {
            bonus = 0;
        }
        long new_balance = current_balance + balance_replenishment + bonus;
        System.out.println(new_balance);

    }
}
```
