package ua.org.oa.kozlobayeva.Practice3;

import java.io.*;

/**
 * Created by Alinka on 01.04.2015.
 */
public class FileWriterSuper {
    public static synchronized void writeSuperFile(String str) {
        BufferedWriter writer = null;
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("super.txt", true)))) {
            out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
