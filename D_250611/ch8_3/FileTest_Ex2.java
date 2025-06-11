package D_250611.ch8_3;

import java.io.File;

public class FileTest_Ex2 {
    public static void main(String[] args) {
        // 새로운 폴더 만들기, backup 폴더 만들기
        // File dir = new File("backup");
        // dir.mkdir();

        // 2. 파일의 크기 확인(용량 확인) test.txt
        // File file = new File("test.txt");
        // System.out.println("파일 용량 확인 : " + file.length());

        // 3. 현재 폴더의 모든 파일/폴더 이름 출력
        // File file = new File(".");
        // // 문자열 타입을 가지는 배열에, 파일, 폴더명을 담기
        // String[] names = file.list();
        // // 출력
        // for (String string : names) {
        // System.out.println("현재 폴더안에 파일명과 폴더명 조회 : " + string);
        // }

        // 4. 특정 폴더가 없으면 새로 만들기
        // File dir = new File("mydir");
        // if (!dir.exists()) {
        // dir.mkdir();
        // }

        // 5. 특정 파일 삭제
        // File file = new File("test.jpg");
        // if (file.isFile()) {
        // file.delete();
        // }

        // 6. 해당 파일 있으면 삭제, 없으면 생성 
        // -> 실행시 처음엔 파일이 없기때문에 생성됬다가 
        // 다시한번 실행하면 파일이 존재하기때문에 생성된 파일이 삭제가 됨
        // try {
        //     File file = new File("input.txt");
        //     if (file.exists()) {
        //         file.delete();
        //     } else {
        //         file.createNewFile();
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

    }
}