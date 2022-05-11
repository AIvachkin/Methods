import java.time.LocalDate;

public class Main {

    public static void determiningVersion (int os , int year) {
        int currentYear = LocalDate.now().getYear() ;
        if (os == 1) {
            if (year == currentYear) {
                System.out.println("Установите обычную версию приложения для Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        } else {
            if (year >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS");
            }
        }

    }
    public static void main(String[] args) {

        byte clientOS = 0;
        int currentYear = 2022;
//        System.out.println(currentYear);
        determiningVersion(clientOS , currentYear);

    }
}