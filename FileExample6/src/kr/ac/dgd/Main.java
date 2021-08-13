package kr.ac.dgd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        FileExample6 : 490p
        FileOutputStream fo = null;
        FileInputStream fi = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try {
            // INPUT
            // OUTPUT
            fo = new FileOutputStream("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/FileExample6/dataFile.txt"); // 파일이 가지고 있는 컨텐츠 : 글, 사진, 영상 ,.....
                                                                                                                               // 이 컨텐츠들은 사실 byte[] 배열의 모음이다.
            dos = new DataOutputStream(fo); // java -> file (OUTPUT)
//            dos.writeShort(-1);         // short : 2byte 자료형.
            dos.writeByte(3);
            dos.writeByte(2); // 16진수
            dos.writeByte(4);
            dos.writeDouble(3.14);
            dos.writeLong(30);
            dos.writeUTF("database test");

            fi = new FileInputStream("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/FileExample6/dataFile.txt"); // file <- java (INPUT)
            dis = new DataInputStream(fi); // java <- file (INPUT)

//            System.out.println(dis.readUnsignedShort()); // 65535 : unsigned(음수없음), short(2byte, 2^16)
            System.out.println(dis.readByte()); // readByte() : 역할이 뭔지? Byte - 파일이 가지고 있는 컨텐츠의 최소단위인데, 이 최소단위 '한개'를 읽어 온다.
            dis.skip(1);                    // skip : 파일 데이터 Stream의 바이트 n개를 건너 뛴다.
            System.out.println(dis.readByte());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
            System.out.println(dis.readUTF());

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fi.close();
                fo.close();
                dos.close();
                dis.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
