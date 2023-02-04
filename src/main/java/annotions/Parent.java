package annotions;

public class Parent {
    public void someMethod() {
        System.out.println("Hello");
    }
    @Deprecated
    public void otherMethod() {
        System.out.println("Doing old stuff...");
    }
}
