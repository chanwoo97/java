package D_250612.ch9_2;
// 컨테이너

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 버튼,라벨, UI를 담는 도화지(그릇) : JFrame, JPanel

// 배치관리자 (LayoutManager)
// 정렬을 어떻게 하냐? 웹 : flex -> 자동으로 나란히 배치, grid -> 행 x 열 (테이블구조)
// 종류 : FlowLayout(flex비슷), BorderLayout(동서남북중앙), GridLayout(Grid와 비슷, 행x열)
// JFrame -> 기본 배치관리자, BorderLayout
// JPanel -> 기본 배치관리자 : FlowLayout

// 기본 문법
// 1) 패널 만들기
// 2) 컴포넌트 추가(버튼 추가)
// 3) 패널-> 프레임(윈도우창)에 붙이기 작업
// JPanel panel = new JPanel();
// panel.setLayout(배치관리자 인스턴스 생성)
// panel.setLayout(new FlowLayout()); -> FlowLayout 배치 관리자 선택, 기능 : 나란히 배치(정렬)
// 버튼 추가
// panel.add(new JButton("예시버튼1"));
// panel.add(new JButton("예시버튼2"));
// 프레임 -> 패널 붙이기.
// JFrame frame = new JFrame("배치관리자 예시");
// frame.add(panel);
// frame.setSize(300, 200);
// frame.setVisible(true);

// 자주 사용하는 옵션
// setLayout(LayoutManager manager), Ex) new FlowLayout(), new BoardLayout(), new GridLayout()
// add(Componet comp) : 버튼 추가 (쉽게 말해서)
// add(Componet comp, Object constraints) : 특정 위치에 배치 하기 위해서

public class _1Container_Layout_Ex1 {
    public static void main(String[] args) {
        // JPanel + FlowLayout
        JFrame frame = new JFrame("FlowLayout 예시");
        JPanel panel = new JPanel();
        // 배치관리자 설정, FlowLayout
        panel.setLayout(new FlowLayout());
        // 패널에 샘플 버튼 4개 정도 추가. 나란히 정렬 확인.
        // JButton button = new JButton("샘플 버튼1"); -> 보통 이렇게 사용해야 함
        panel.add(new JButton("샘플 버튼1"));
        panel.add(new JButton("샘플 버튼2"));
        panel.add(new JButton("샘플 버튼3"));
        panel.add(new JButton("샘플 버튼4"));
        // 프레임에 패널 붙이기
        frame.add(panel);
        // 창 크기, 창 닫기시 종료, 창 보이기, 1세트
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
