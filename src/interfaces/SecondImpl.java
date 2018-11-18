package interfaces;

public class SecondImpl implements ISecond {
    @Override
    public void printMsg(String msg) {
        System.out.println("msg = [" + msg + "] from " + getClass().getName());
    }


}
