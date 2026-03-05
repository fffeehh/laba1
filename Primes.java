public class Primes {
    public static void main(String[] args) {
        // Вывод простых чисел в диапазоне от 2 до 100
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    //  Проверяет, является ли число простым (делится только на 1 и на себя)
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            // Если найден делитель без остатка - число не простое
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
