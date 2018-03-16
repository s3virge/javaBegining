import java.util.*;

public class Main {

    private static String[] appArgs; //

    public static void main(String[] args) {
        appArgs = args;
        launch();
    }

    public static void launch() {
        /*System.out.println("---- Execute testFor() -----");
        testFor();

        System.out.println("---- Execute testFor2() -----");
        testFor2();

        System.out.println("---- Execute arrayLength() -----");
        arrayLength();

        System.out.println("---- Execute testPrintHex() ----");
        testPrintHex();

        System.out.println("---- Execute testPrintBin() ----");
        testPrintBin();*/

        System.out.println("---- Execute testBinaryOperations ----");
        testBinaryOperations();
/*
        System.out.println("---- Execute launchFromConsole ----");
        launchFromConsole();

        System.out.println("---- Execute testAppArgs ----");
        testAppArgs();*/
    }

    private static void testAppArgs() {
        ArgumentExample argExample = new ArgumentExample();
        argExample.showProgrammArguments(appArgs);
    }

    public static void testPrintHex() {
        PrintValue print = new PrintValue();

        int intVal = 0;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter number (-1 for exit): ");
            intVal = input.nextInt();
            if (intVal == -1){
               break;
            }
            System.out.print("Число " + intVal + " в hex: 0x");
            print.asHex(intVal);
            System.out.println();
        }
    }

    public static void testPrintBin() {
        PrintValue print = new PrintValue();
        int iVal = 0;
        /*Constructs a new Scanner that produces values scanned from the specified input stream.
        Bytes from the stream are converted into characters using the underlying platform's default charset. */
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter number (-1 for exit): ");
            iVal = in.nextInt();
            if (iVal == -1){
                break;
            }
            System.out.print("Число " + iVal + " в двоичной системе: ");
            print.asBin(iVal);
            System.out.println();
        }
    }

    private static void arrayLength() {
        int[] i = {1, 2, 3, 4, 5, 6, 7};

        //length возвращает колличество элементов в массиве
        //i.length = 7;
        System.out.printf("элементов в массиве = %d\n", i.length);

        for (int c = 0; c < i.length - 1; ++c) {
            System.out.printf("i[%d] = %d\n", c, i[c]);
        }
    }

    private static void testFor() {
        int[] i = {0, 1, 2, 3, 4, 5, 6};

        int rc = 0;

        for (int c = 0; c < i.length; c++) {
            if (c % 2 == 0) //остаток от деления 0 на 2 = 0
                continue; //все четные пропускаем

            rc += 1;

            if (c % 5 == 0)
                break;
        }

        //rc=3
        System.out.println("rc = " + rc);
    }

    private static void testFor2() {
        int c = 0;

        for (; c <= 5;) {
            System.out.println("c = " + c);
            c++;
        }
    }

    private static void testBinaryOperations() {
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

        boolean bt = false, bf = true;

        if (bt & bf) {
            System.out.println("(bt & bf) == true");
        }
        else if (bf ^ bt) {
            System.out.println("(bf ^ bt) == true");
        }
        else if (bf ^ bf) {
            System.out.println("(bf ^ bf) == true");
        }
        else if (bt | bf) {
            System.out.println("(t | f)");
        }

    }

    //запуск из консоли
    public static void launchFromConsole() {
        System.out.println("first we ned to compile java file. For example: javac Welcome.java");
        System.out.println("and then we ned to launch compiled file. For example: java Welcome");
    }

    //todo запуск jar с зависимостями из командной стрики
    //todo classpath
    //todo interface и полиморфизм
    //todo сложение, вычитание множеств
}