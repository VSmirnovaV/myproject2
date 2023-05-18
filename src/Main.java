public class Main {
    public static void main(String[] args) {
        int check = 50;
        int x = 100;
        int sum = 500;
        int result;
        int bonus;
        if (sum >= 1000) {
            bonus = sum / x;
        } else {
            bonus = 0;
        }
        if (sum >= 1000) {
            result = check + sum + bonus;
        } else {
            result = sum + check;
        }
        System.out.println(result);
        System.out.println(bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}