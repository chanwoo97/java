package D_250612.web_structure.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _3MainFrame extends JFrame {
    // 설계 클래스들은, 인스턴스를 이용해서, 화면을 호출하기 때문에
    // 실제 화면을 그리는 작업, 기본 생성자에서 작업을 합니다.
    public _3MainFrame() {
        setTitle("메인 화면");
        setSize(400, 200);
        setLocationRelativeTo(null); // 화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 회원 가입 버튼 생성
        JButton btnSignup = new JButton("회원 가입");
        // 회원 가입 버튼, 이벤트 작업, 클릭시 회원가입화면으로 이동하는 기능 추가
        btnSignup.addActionListener(e -> {
            new _4SignupFrame(); // 회원가입 화면으로 이동, 그 클래스의 생성자를 호출하는 형식.
            dispose(); // 현재 창 닫기.
        });

        // 버튼을 패널에 추가, 프레임에 배치
        JPanel panel = new JPanel();
        panel.add(btnSignup);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

}
