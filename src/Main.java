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
        boolean t = true, f = false;

        if (t ^ f) {
            System.out.println("t = " + t);
            System.out.println("f = " + f);
        }
        else if (t & f) {
            System.out.println("(t & f) == true");
        }
        else if (f & t) {
            System.out.println("(f & t) == true");
        }
        else if (t | f) {
            System.out.println("()");
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