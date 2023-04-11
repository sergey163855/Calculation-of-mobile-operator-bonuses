public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int amount = 1500;
        int percent = 100;
        if (amount > 1000) {
            System.out.println("Бонус" + (balance + amount) / percent);
        } else {
            System.out.println("Бонус равен 0");
        }
    }
}
