package ua.org.oa.kozlobayeva.Practice3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Alinka on 01.04.2015.
 */
public class FileQueue {
    static private LinkedList<String> queue = new LinkedList<String>();
    static {
        queue.push("9.txt");
        queue.push("8.txt");
        queue.push("7.txt");
        queue.push("6.txt");
        queue.push("5.txt");
        queue.push("4.txt");
        queue.push("3.txt");
        queue.push("2.txt");
        queue.push("1.txt");
    }

    public static synchronized String getNextFile() {
        try {
            return queue.pop();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
