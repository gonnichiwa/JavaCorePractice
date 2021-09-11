package kr.ac.dgd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        FileExample7 : 506p 507p 'Buffer' : 데이터를 따로 저장 해 놓는 공간. (공간을 비워주는 함수/메소드를 '호출'해야 버퍼 안에 들어 있는 데이터를 처리 시킨다.)
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("./FileExample7/bufferedWriter.txt");
            bw = new BufferedWriter(fw, 2);
            bw.write('A');
            bw.write('B');
            bw.write('C');
            bw.write('D');

            Scanner sc = new Scanner(System.in);
            String input = null;
            do {
                System.out.println("입력하시오.");
                input = sc.next();
                if(input.equals("end")){
                    System.exit(0); // "end" 입력 시 강제종료
                }
            } while(!input.equals("Q")); // "Q" 입력 받을 때 까지 계속 반복

            // 데이터가 버퍼 사이즈만큼 전부 채워 지길 기다렸다가 flush 하는 경우 (비움)
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }

    }
}
