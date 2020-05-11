package exception;

public class Main {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        try {
            sc.methodUncheckedException(2);
            sc.methodUncheckedException(0);


            sc.methodCheckedException(3);
        } catch (CheckedException exception) {
            exception.getStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("after exception");
    }
}
