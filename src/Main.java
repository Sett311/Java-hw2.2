// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int pay = 1001;
        //boolean more1000 = pay > 1000;
        int bonus = pay > 1000 ? pay / 100 : 0;
        int total = account + pay + bonus;
        if (bonus == 0) {
            System.out.println("Клиент пополнил счёт на " + pay +" рублей — бонусов нет, итоговая сумма на счету клиента — " + total +" рублей.");
        }
        else {
            System.out.println("Клиент пополнил счёт на " + pay +" рублей — бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + total + " рублей.");
        }

    }

}