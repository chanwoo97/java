package D_250612.ch9;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2SwingUI_Test_Ex1_2 {
    public static void main(String[] args) {
        // Jframe 틀 안에 버튼 추가
        JFrame frame = new JFrame("버튼 테스트, 창 제목");
        // 버튼 객체 필요함
        JButton button = new JButton("Click Me!!");
        // 버튼을 프레임에 붙이기 작업
        frame.add(button);
        frame.setSize(300, 200);
        // 창을 닫을 때, 프로그램 종료
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
