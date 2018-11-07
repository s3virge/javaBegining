public class ArgumentExample {

    public static void main(String[] args) {
        ArgumentExample argEx = new ArgumentExample();
        argEx.showArguments(args);
    }

    public final void showArguments(String[] args ) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}