import java.util.ListIterator;
import java.util.Vector;

public class PrintValue {
    public void asHex(int numToHex) {
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
}
