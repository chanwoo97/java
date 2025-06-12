package D_250612.ch9_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2Container_Layout_Ex2 {
    public static void main(String[] args) {
        // JPanel + BorderLayout
        JFrame frame = new JFrame("BorderLayout 예시");
        // 프레임에 배치관리자, BorderLayout 설정
        frame.setLayout(new BorderLayout());
        // 동, 서, 남, 북, 중앙
        frame.add(new JButton("샘플 버튼 북쪽"), BorderLayout.NORTH);
        frame.add(new JButton("샘플 버튼 동쪽"), BorderLayout.EAST);
        frame.add(new JButton("샘플 버튼 남쪽"), BorderLayout.SOUTH);
        frame.add(new JButton("샘플 버튼 서쪽"), BorderLayout.WEST);
        frame.add(new JButton("샘플 버튼 중앙"), BorderLayout.CENTER);

        // 창 크기, 창 닫기시 종료, 창 보이기, 1세트
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
