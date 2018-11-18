package interfaces;

public interface ISecond {
    void printMsg(String msg);

    default void defaultInterfaceMethod() {
        System.out.println(getClass().getName() + " showMessagefromInterface()");
    }
}
