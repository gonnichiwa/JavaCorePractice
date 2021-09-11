package kr.ac.dgd;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {

    public static class ImageNameFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(".jpg");
        }
    }

    public static void main(String[] args) {
//        FileExample : 471p
        System.out.println("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/ 의 전체 파일 출력");
        File file = new File("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/FileExample"); // pathname에 위치한 파일/디렉토리들의 정보(디렉토리인지? 파일이름들...)들을 모두 가져옴
        String[] files = file.list();
        for(String fileName : files){
            System.out.println("ffff= " + fileName);
            File subFile = new File(file, fileName); // pathname(file) 에 속한 파일 이름 (fileName) 을 생성자 파라미터로 제공하여 한개의 파일 객체를 메모리에 적재 한다.
            if(subFile.isDirectory()){
                System.out.println("디렉터리 이름 : " + fileName);
            } else {
                System.out.println("파일 이름 : " + fileName + ", 파일 크기: " + subFile.length() + "byte.");
            }
        }

        // getAbsolutePath() : 절대 경로 - C://segsegeg/segseg/sgsegs/segseg/segseg/awfawf/sgeseg/segseg.jpg
        // 상대경로 : 경로 자체를 호출하는 파일의 위치를 기준으로 쓰는 경로. (../ ./)
        File makeFile = new File("/Users/jae-hunjeong/dev/JavaExample/JavaCorePractice/test/testFile.txt");
        try {
            makeFile.createNewFile(); // java 언어에서는 일부 객체의 메소드에 한해 강제적인 예외처리를 요구한다. (파일접근 , db관련 , ...) - java 시스템 바깥의 시스템에 접근해서 뭔가를 하고 싶을때.
        } catch (IOException e){ // 파일 처리의 경우 담당하는 예외
            e.printStackTrace();
        }
    }
}
