public class Main {
    public static void main(String[] args) {
        int ticket = 13_676;
        int mile = 20;
        int bonus = ticket / mile;
        int sale = bonus * 10;

        System.out.println("Начислено миль: " + bonus);
        System.out.println("Скидка: " + sale);
    }
}