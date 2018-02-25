import java.util.*;

public class Main {
    public static void main(String[] args) {
        //testFor();
        System.out.println("Execute testFor2()");
        testFor2();

//        for(int c = 0; c <= 10000; c++) {
//            //convertToBinary(c);
//            printHex(c);
//        }

        System.out.println("Execute testPrintHex()");
        testPrintHex();
    }

    private static void testPrintHex() {
        int intVal = 0;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter number (-1 for exit): ");
            intVal = input.nextInt();
            if (intVal == -1){
               break;
            }
            System.out.print("Число " + intVal + " в hex: 0x");
            printHex(intVal);
            System.out.println();
        }
    }

    private static void printHex(int numToHex) {
        //берем число и начинаем его делить на 16
        int cc = 16;

        //System.out.printf("%d = ", numToHex);

        if (numToHex == 0) {
            System.out.print("0");
            return;
        }

        Vector<Integer> vec = new Vector<>();

//        for (;numberToConvert > 0;) {
//            vec.add(numberToConvert % 2);
//            numberToConvert /= 2;
//        }

        while (numToHex > 0) {
            vec.add(numToHex % cc);
            numToHex /= cc;
        }

//        Collections.reverse(vec);

        int size = vec.size();
        ListIterator fwd = vec.listIterator();
        ListIterator rev = vec.listIterator(size);
        for (int i = 0, mid = size >> 1; i < mid; i++) {
            Object tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }

        String hex = "";

        for (Integer i : vec) {

            if (i < 10){
                System.out.print(i);
            }
            else {
                switch (i){
                    case 10:
                        hex = "A";
                        break;

                    case 11:
                        hex = "B";
                        break;

                    case 12:
                        hex = "C";
                        break;

                    case 13:
                        hex = "D";
                        break;

                    case 14:
                        hex = "E";
                        break;

                    case 15:
                        hex = "F";
                        break;
                }
                System.out.print(hex);
            }
        }
    }

    private static void testFor() {
        int[] i = {1, 2, 3, 4, 5, 6, 7};

        //length возвращает колличество элементов в массиве
        //i.length = 7;
        System.out.printf("элементов в массиве = %d\n", i.length);

        for (int c = 0; c < i.length - 1; ++c) {
            System.out.printf("i[%d] = %d\n", c, i[c]);
        }
    }

    private static void testFor2() {
        int[] i = {0, 1, 2, 3, 4, 5, 6};

        int rc = 0;

        for (int c = 0; c < i.length; c++) {
            if (c % 2 == 0) //остаток от деления 0 на 2 = 0
                continue; //все четные пропускаем

            rc += 1;

            if (c % 5 == 0)
                break;
        }

        System.out.println("rc = " + rc);
    }

    private static void printBin(int numberToConvert) {
        //берем число и начинаем его делить на 2

        System.out.printf("%d = ", numberToConvert);

        if (numberToConvert == 0) {
            System.out.print("0");
            System.out.println("\n----------------");
            return;
        }

        Vector<Integer> vec = new Vector<>();

//        for (;numberToConvert > 0;) {
//            vec.add(numberToConvert % 2);
//            numberToConvert /= 2;
//        }

        while (numberToConvert > 0) {
            vec.add(numberToConvert % 2);
            numberToConvert /= 2;
        }

//        Collections.reverse(vec);

        int size = vec.size();
        ListIterator fwd = vec.listIterator();
        ListIterator rev = vec.listIterator(size);
        for (int i = 0, mid = size >> 1; i < mid; i++) {
            Object tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }

        for (Integer i : vec) {
            System.out.print(i);
        }

        System.out.println("\n----------------");

    }
}