package interfaces;

public interface Message {
    void printMsg(String msg);

    default void showInterfaceMessage() {
        System.out.println(getClass().getName() + " showMessagefromInterface()");
    }
}
