package ua.org.oa.kozlobayeva.Practice3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Alinka on 01.04.2015.
 */
public class WriteThread implements Runnable {

    @Override
    public void run() {
        do {
            String nextFile = FileQueue.getNextFile();
            if (nextFile == null) {
                break;
            }
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                File file = new File(classLoader.getResource(nextFile).getFile());
                BufferedReader br = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();
                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        line = br.readLine();
                    }
                    String everything = sb.toString();
                    FileWriterSuper.writeSuperFile(everything);
                } finally {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } while (true);
    }
}
