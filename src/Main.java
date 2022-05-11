public class Main {


    public static void calculationLeapYear (int leapYear) {
        float year400 = leapYear % 400 ;
        float year100 = leapYear % 100 ;
        float year4 = leapYear % 4 ;

        if (year400 == 0) {
            System.out.println(leapYear + " - високосный год");
        } else if (year100 == 0) {
            System.out.println(leapYear + " - не високосный год");
        } else if (year4 == 0) {
            System.out.println(leapYear + " - високосный год");
        } else {
            System.out.println(leapYear + " - не високосный год");
        }
    }

    public static void main(String[] args) {
        int year = 2022 ;
        calculationLeapYear(year);
    }
}