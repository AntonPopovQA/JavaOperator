public class Main {
    public static void main(String[] args) {
        int invoiceAmout = 300;
        int replenishmentAmount = 1500;
        int bonus = replenishmentAmount / 100;
        int grandTotal = invoiceAmout + replenishmentAmount;

        if (replenishmentAmount <= 1000) {
            bonus = 0;
        }
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый счет: " + grandTotal);
    }
}
