package interfaces;

public interface IInterFaceSecond {
    void printMsg(String msg);

    default void showInterfaceMessage() {
        System.out.println(getClass().getName() + " showMessagefromInterface()");
    }
}
