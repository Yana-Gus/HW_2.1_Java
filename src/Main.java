public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5_000;
        int bonusMileCost = 20;

        int miles = ticketPrice / bonusMileCost;

        System.out.println("Бонус: " + miles);
    }
}