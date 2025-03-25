public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double d;
        a = 5;
        b = 3;
        c = 2;
        d = 2.5;

        // Арифметические операции с int
        System.out.println("Арифметические операции");
        System.out.println("Результат сложения a + b = " + (a + b));
        System.out.println("Результат вычитания b - a = " + (b - a));
        System.out.println("Результат умножения a * b = " + (a * b));
        System.out.println("Результат деления b / a = " + (b / a));

        // Арифметические операции с int и double
        System.out.println("Результат сложения a + d = " + (a + d));
        System.out.println("Результат деления a / d = " + (a / d) + "\n");

        // Логические операции
        System.out.println("Логические операции");
        System.out.println("b больше чем a? " + (a > b));
        System.out.println("b меньше или равно чем a? " + (a <= b));
        System.out.println("b равно с? " + (b == c));
        System.out.println("b больше или равно с? " + (b >= c) + "\n");

        // Переполнение и диапазоны
        d = Double.MAX_VALUE;
        System.out.println("Переполнение при арифметической операции");
        System.out.println("Переполненное значение double: " + (d * 2));
        System.out.println("Результат деления 0.0/0.0: " + (0.0 / 0.0));
        d = Double.MIN_VALUE;
        System.out.println("Минимальное значение double = " + d);
        System.out.println("Результат деления минимального значения double на 10 = " + (d / 10));
    }
}