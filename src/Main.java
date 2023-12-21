public class Main {
    public static void main(String[] args) {
        //Exercise 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является высокосным");
        }
        System.out.println("---------------------");
        //Exercise 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //Exercise 8
        int moneyInBank = 0;
        for (int i = 1; i <= 12; i++) {
            moneyInBank += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneyInBank + " рублей");
        }
        System.out.println("---------------------");
        //Exercise 9
        float moneyInBankPr = 0;
        for (int i = 1; i <= 12; i++) {
            moneyInBankPr += 29000;
            moneyInBankPr += (moneyInBankPr * 0.01);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneyInBankPr + " рублей");
        }
        System.out.println("---------------------");
        //Exercise 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}