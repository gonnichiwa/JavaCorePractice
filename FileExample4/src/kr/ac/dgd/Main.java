package kr.ac.dgd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
//        FileExample4 : 485p
        FileOutputStream fos = null;
        String msg = "FileOutputStream Test";
        byte[] byteArray = msg.getBytes(StandardCharsets.UTF_8);

        try {
            fos = new FileOutputStream("/fileOutput.txt", true);
            fos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
