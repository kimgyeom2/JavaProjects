import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEventTest extends JFrame {
	
	// 프레임이 보여줄 컴포넌트들의 참조변수는 가급적 멤버변수로 만들어 놓으면 좋음.
	JButton btn;  //참조변수
	JLabel label; //참조변수
	
	JButton btn2;
	JLabel imgLabel;
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setSize(400, 450);
		setTitle("버튼 클릭 이벤트처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(800, 50);
		
		// 간단하게 옆으로 배치되도록 배치관리자를 변경
		setLayout(new FlowLayout());
		
		// 버튼을 클릭하여 Label의 글씨를 변경해보기
		
		// Button, Label 컴포넌트 하나씩 배치
//		JButton btn=new JButton("button");
//		JLabel label=new JLabel("Hello World");		
		
		// 컴포넌트들의 참조변수는 클래스안에 어디서든 인식할 수 있도록
		// 멤버변수로 만들어 놓을것을 권장 합니다.
		btn=new JButton("button");
		label=new JLabel("Hello world");
		
		// 프레임에 붙이기
		add(btn);
		add(label);
		
		// 버튼(btn)이 클릭되는 것을 듣는 리스너객체를 생성 및 버튼에 달기
		// 리스너 객체 생성
		// ActionListener listner=new ActionListener(); //error 인터페이스는 직접 객체생성 불가
		// 인터페이스의 추상메소드를 구현하는 별도의 클래스를 설계하여 객체로 생성해야함
		ClickListener listener=new ClickListener();
		
		// 버튼에 리스너를 붙이기
		btn.addActionListener(listener);
		
		
		
		// 버튼2번 클릭시 이미지 변경해보기
		btn2=new JButton("Change Img");
		imgLabel=new JLabel();
		ImageIcon icon=new ImageIcon("image/kpj002.png");
		//리 사이징
		Image im=icon.getImage();
		Image im2=im.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon icon2=new ImageIcon(im2);
		imgLabel.setIcon(icon2);
		
		// frame에 추가
		add(imgLabel);
		add(btn2);
		
		// 버튼2 클릭되는 이벤트액션을 듣는 리스너객체 생성- 버튼1과 다른동작을 해야하기에
		// ActionListener listner=new ActionListener(); 인터페이스 객체 x
		// 인터페이스를 구현한 별도의 클래스를 또 만드려니 짜증
		// 그리너 ActionListener 객체를 생성하면서 추상메소드를 그 자리에서 구현해버리기
		// 객체를 생성하면서 클래스를 설계하는 문범- 익명클래스
		ActionListener listen=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스 객체 clicked");
				
				//이미지 변경 - 사이즈조절하면서
				Image im=new ImageIcon("image/ms_05.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(im));
			}
			
		};
		btn2.addActionListener(listen);	
		
		
		setVisible(true);
	}// 생성자
	
	// ActionListener 인터페이스의 추상메소드를 구현하는 클래스 설계
	// inner class - outer class의 멤버를 내것인양 사용 가능
	
	class ClickListener implements ActionListener{
		
		// 이 리스너객체가 감시하는 컴포넌트에 (클릭)이벤트가 발동하면 자동으로 실행되는 콜백메소드 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("clicked!");
			label.setText("Nice to meet you");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest(); //JFrame능력을 가진 클래스를 객체로 생성
		
	}

}// class
