package ua.org.oa.kozlobayeva.Practice3;

public class Demo {

    public static void main(String[] args) {

        Property prop = new Property();

        for (int i = 0; i < Integer.parseInt(prop.getProp("amountThreads")); i++) {
            WriteThread writeThread = new WriteThread();
            writeThread.run();
        }

    }
}
