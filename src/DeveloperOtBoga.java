public class DeveloperOtBoga {
    public static void main(String[] args) {
        int hour = 10;
        int min = 05;
        if (hour >= 0 && hour <= 12) {
            if (min >= 0 && min < 60) {
                double angleHour = hour * 30 + 0.5 * min;
                double angleMin = min * 6;
                double angle = angleHour - angleMin;
                System.out.println("ANGLE = " + angle);
            } else {
                System.out.println("Введіть значення від 0 до 59");
            }
        }

            else{
                System.out.println("Введіть значення від 0 до 12");

            }
        }
    }
}