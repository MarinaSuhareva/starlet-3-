public class Main {
    public static void main(String[] args) {
        int remains = 89;
        int payment = 1250;
        int balance = (remains + payment);
        int gift = 1;
        int bonusCalculation = 100;
        char whitespace = ' ';
        int bonus = ((payment / bonusCalculation) * gift);
        int capital = (balance + bonus);

        System.out.println(payment + ((whitespace + " Поступление на счет")));

        if (payment >= 1000) {
            System.out.println(bonus + (whitespace + "Ваш бонус"));
            System.out.println(capital + (whitespace + "На счету"));
        } else {
            System.out.println("0" + (whitespace + "Ваш бонус"));
            System.out.println(balance + (whitespace + "На счету"));
        }
    }
}
