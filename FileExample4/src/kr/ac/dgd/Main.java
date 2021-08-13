package kr.ac.dgd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
//        FileExample4 : 485p
        // java 코드에서 생성한 문자열 데이터를 FileOutputStream 이용하여 fileOutput.txt에 쓰기.
        FileOutputStream fos = null;
        String msg = "FileOutputStream Test 안녕하세요";
        byte[] byteArray = msg.getBytes(StandardCharsets.UTF_8); // 안전하게 UTF-8인코딩 지정하여 다국어(한글) 지원 할 수 있도록.

        try {
            // 상대경로를 지정할때 어떻게 테스트 해가면서 쓸지? : ./ 찍어서 실제 동작이 어떻게 되는지 확인하고 작성.
            // apppend의 뜻. : 기존 컨텐츠에 ++.
            fos = new FileOutputStream("./FileExample4/demo/fileOutput.txt", false);
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

        // 번외 : StringBuilder (append가 있길래)
        StringBuilder sb = new StringBuilder("hihi");
        sb.append("방가방가");
        System.out.println(sb); // result : hihi방가방가
        // 위코드는 아래와 출력 내용이 같다.
        String str = "hihi";
        str = str + "방가방가";
        System.out.println(str);

    }
}
