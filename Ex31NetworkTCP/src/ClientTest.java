import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클라이언트는 서버의  ip주소와 port번호를 알아야 접속가능
		String serverIP="172.30.1.35";
		serverIP="127.0.0.1"; //본인Pc를 말하는IP
		serverIP="localhost"; //본인Pc의 컴퓨터식별자(일종의 도메인)
		
		// 클라이언트용 작업
		try {
			// 1) 서버와 연결하는 Socket생성 (ip주소,port번호 필요)
			Socket socket=new Socket(serverIP,12345);
			System.out.println("서버와 연결되었습니다");
			
			// 2) 데이터를 전달하기 위한 무지개로드(Stream)만들기
			// 데이터를 내보내는 스트림 : OutputStream
			OutputStream os= socket.getOutputStream();
			// 보조문자스트림을 사용하면 write작업을 보다 수월하게 작성할 수 있음
			PrintWriter writer=new PrintWriter(os);
			System.out.println("스트림연결작업 성공! 데이터전송 가능상태");
			
			// 보낼 데이터를 키보드로 입력받기
			Scanner scan=new Scanner(System.in);
			
			// 3) 스트림을 통해 데이터를 전송
			while(true) {
			System.out.print("보낼 메세지 입력 : ");
			String msg=scan.nextLine();		
			
			if(msg.equalsIgnoreCase("quit")) break;
			
			writer.println(msg);
			writer.flush();
			}
			
			//스트림 닫기
			writer.close();
			System.out.println("통신종료");
		} catch (IOException e) {}
	}

}
