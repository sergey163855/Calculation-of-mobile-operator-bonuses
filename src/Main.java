import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int percent =100;
        if (amount > 1000) {
            System.out.println("Бонус" + amount / percent );
            System.out.println("Итоговый баланс" + ((amount / percent) + amount + balance));
        } else {
            System.out.println("Бонус 0");
            System.out.println("Итоговый баланс"+(balance + amount));
        }
    }
}
