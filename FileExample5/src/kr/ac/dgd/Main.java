package kr.ac.dgd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
//        FileExample5 : 487p
        String msg = "ByteArrayOutputStream test";
        ByteArrayOutputStream baos = null;

        try {
            baos = new ByteArrayOutputStream();
            baos.write(msg.getBytes(StandardCharsets.UTF_8));
            System.out.println("baos = " + baos);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
