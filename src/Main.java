public class Main {
    public static void main(String[] args) {
        int check = 50;
        int cashback = 100;
        int sum = 1500;
        int result;
        int bonus;
        if (sum >= 1000) {
            bonus = sum / cashback;
            result = check + bonus + sum;
        } else {
            bonus = 0;
            result = sum + check;
        }
        System.out.println("Итоговая сумма:" + result);
        System.out.println("Бонус:" + bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}