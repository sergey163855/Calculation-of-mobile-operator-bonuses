import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int amount = 1100;

        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
        }
        int endingBalance = startingBalance + amount + bonus;
        System.out.println("Итоговый баланс:" + endingBalance);
        System.out.println("бонус:" + bonus);
    }
}

