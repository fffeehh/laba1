public class Palindrome {
    public static void main(String[] args) {
        //  Перебор аргументов командной строки и проверка на палиндром
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " - является палиндромом");
            } else {
                System.out.println(s + " - не является палиндромом");
            }
        }
    }

    //  Инвертирует строку
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    //  Проверяет, читается ли строка одинаково в обоих направлениях
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}
