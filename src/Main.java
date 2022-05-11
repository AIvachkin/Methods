public class Main {

    public static int calculationNumberDays (int distance) {
        int distance1Day = 20 ;
        int distance2Day = 60 ;
        if (distance <= distance1Day) {
            return 1;
        } else if (distance <= distance2Day) {
            return 2;
        } else {
            return 3;

        }
    }
    public static void main(String[] args) {
        int deliveryDistance = 95 ;
        int numberOfDays = calculationNumberDays(deliveryDistance) ;
        System.out.println("Итоговое количество дней доставки: " + numberOfDays) ;
    }
}