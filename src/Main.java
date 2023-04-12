import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int amount = 2000;
        int percent = 100;
        if (amount > 1000) {
            System.out.println("Бонус" + (balance + amount) / percent);
            System.out.println("Баланс" + (balance + amount));
        } else {
            System.out.println("Бонус 0");
            System.out.println("Баланс" + (balance + amount));
        }
    }
}
