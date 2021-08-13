package kr.ac.dgd;


import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        FileExample2 : 478p 479p
        // 예제의 의도? 파일의 컨텐츠를 어떻게 읽어 들여 출력 할까?

        FileInputStream fis = null;

        try {
            // C, C++ : 메모리에 객체를 적재 명령을 하면, 런타임에서 해당 객체를 다 쓰고 난 뒤에 '해제' 하는 코드를 집어 넣어줘야 한다.
            // JAVA : GARBEGE COLLECTOR (쓰레기 수집기) : new Instance(); 객체를 메모리에 적재하고 GC가 '알아서' 메모리 해제 한다.
            fis = new FileInputStream("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/FileExample2/demo/test.txt"); // 메모리(RAM)의 자원을 고정해서 점유한다.
        } catch (IOException e){
            e.printStackTrace();
        }

        int var_read = -1;
        try {
            while((var_read = fis.read()) != -1){
                System.out.println((char)var_read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // try 블록에서 exception이 발생이 되던 안되던 실행되는 블록
            try {
                fis.close(); // 메모리(RAM) 자원 반납
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
}
