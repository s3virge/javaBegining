package interfaces;

public class FirstrImpl implements IFirst {
    @Override
    public void showMessage(String text) {
        System.out.println("text = [" + text + "]");
    }

    @Override
    public void printMsg(String msg) {
        System.out.println("FirstrImpl.printMsg");
    }
}
