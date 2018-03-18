public class BitOperator {
    void example() {
        System.out.println("Побитовые операции в Java можно проводить только над целочисленными типами данных." +
                "\n То есть long, int, short, char, byte." +
                "\nРазница в работе с целочисленными значениями только в том сколько они хранят в себе диапазон допустимых значений.");

        System.out.println("\nПример работы с типом byte");
        byte a = 47;
        byte b = (byte) ~a;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа:" + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b) + "\n");

        System.out.println("Пример работы с типом short");
        short c = 350;
        short d = (short) ~c;
        System.out.println(d);
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
        System.out.println("Представление числа:" + d + " в двоичной системе исчисления: " + Integer.toBinaryString(d) + "\n");

        System.out.println("Пример работы с типом int");
        int e = 555555555;
        int f = ~e;
        System.out.println(f);
        System.out.println("Представление числа: " + e + " в двоичной системе исчисления: " + Integer.toBinaryString(e));
        System.out.println("Представление числа:" + f + " в двоичной системе исчисления: " + Integer.toBinaryString(f) + "\n");

        System.out.println("Пример работы с типом long");
        long g = 111112222233333L;
        long h = ~g;
        System.out.println(h);
        System.out.println("Представление числа: " + g + " в двоичной системе исчисления: " + Long.toBinaryString(g));
        System.out.println("Представление числа:" + h + " в двоичной системе исчисления: " + Long.toBinaryString(h) + "\n");

    }

    void NOT() {
        System.out.println("~ Побитовый унарный оператор NOT\n" +
                "~101010 => 010101\n");

        System.out.println("Пример работы с типом byte");
        byte a = 47;
        byte b = (byte) ~a;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа:" + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b) + "\n");

        System.out.println("Пример работы с типом short");
        short c = 350;
        short d = (short) ~c;
        System.out.println(d);
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
        System.out.println("Представление числа:" + d + " в двоичной системе исчисления: " + Integer.toBinaryString(d) + "\n");

        System.out.println("Пример работы с типом int");
        int e = 555555555;
        int f = ~e;
        System.out.println(f);
        System.out.println("Представление числа: " + e + " в двоичной системе исчисления: " + Integer.toBinaryString(e));
        System.out.println("Представление числа:" + f + " в двоичной системе исчисления: " + Integer.toBinaryString(f) + "\n");

        System.out.println("Пример работы с типом long");
        long g = 111112222233333L;
        long h = ~g;
        System.out.println(h);
        System.out.println("Представление числа: " + g + " в двоичной системе исчисления: " + Long.toBinaryString(g));
        System.out.println("Представление числа:" + h + " в двоичной системе исчисления: " + Long.toBinaryString(h) + "\n");
    }

    void AND() {
        System.out.println("~ Побитовый унарный оператор AND\n");
        System.out.println(" 1(правда) выйдет только тогда когда обе части правда (1 & 1 → 1).\n");

        int a = 7;
        int b = 5;
        int c = a & b;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
    }

    void OR() {
        System.out.println("если хоть одна часть правда, тогда все правда (0 | 1 → 1).");

        int a = 7;
        int b = 5;
        int c = a | b;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
    }

    void XOR() {
        System.out.println("обе части должны отличаться друг от друга (0 ^ 1 → 1) но (1 ^ 1 → 0).");

        int a = 7;
        int b = 5;
        int c = a ^ b;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
    }
}
