package D_250611.ch8_3;

import java.io.File;

// File 클래스 이용해서
// 파일 및 디렉토리 정보 처리 방법
// 파일 객체 생성해서, 파일/폴더 존재 여부 확인, 정보읽기
// 파일/폴더 생성, 삭제, 목록 조회
// 기본 문법
// File file = new File("testFile.txt"); 생설할 파일명 작성
// 자주 사용하는 옵션
// exists() : 존재 여부 확인
// isFile() : 파일 여부 확인, 파일 인지 판별
// isDirectory() : 디렉토리 여부 확인, 폴더 인지 확인
// length() : 파일 크기 확인
// delete() : 파일 삭제
// createNewFile() : 파일 생성
// mkdir() : 디렉토리 생성, 폴더 생성
// list() : 디렉토리 목록 조회, 폴더 목록 조회

public class FileTest_Ex1 {
    public static void main(String[] args) {
        // data.txt가 존재하는지 확인하는 예시
        File file = new File("test.txt");
        System.out.println("파일의 존재 여부 : " + file.exists());
    }

}
