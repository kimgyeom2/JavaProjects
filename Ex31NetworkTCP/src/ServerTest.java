import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 통신을 하려면 일단 IP주소는 알아야함
		
		// 자바에 IP주소에 관련된 정보를 가지고 있는 클래스:InetAddress
		// 본인의 IP주소를 확인하는 방법
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().toString());
			System.out.println(InetAddress.getLoopbackAddress().getHostAddress());
			System.out.println(InetAddress.getLoopbackAddress().getHostName());
		} catch (UnknownHostException e) {}
		
		// 통신을 구현하려면 2가지 용어를 알아야함
		// 1. IP주소 : 그 컴퓨터의 고유한 주소(숫자) :42억개
		// 2. port번호 : 그 컴퓨터안에서의 프로그램 고유번호(6만5천개) 컴퓨터안에서 어떤프로그램한테 데이터를 줄지정할때 사용
		// 0~1024번까지는 사용하지 않는것을 권장
		// ex) - 부산항(IP주소), 3번항구(port번호)
		
		// 서버용 프로그램 작성
		// 1. 서버소켓 만들기
		try {
			ServerSocket serverSocket=new ServerSocket(12345); //port번호 필요함
			System.out.println("서버소켓이 생성되었습니다");
			
		// 2. 클라이언트의 접속 기다리기
			System.out.println("클라이언트의 접속을 기다립니다..");
			Socket socket=serverSocket.accept(); //여기서 커서(스레드)가 대기함
			System.out.println("클라이언트가 접속하셨습니다.");
			
		// 3. 클라이언트로부터 데이터를 읽어오는 무지개로드 필요함
			InputStream is=socket.getInputStream(); //바이트 스트림
			InputStreamReader isr=new InputStreamReader(is); //문자 스트림
			BufferedReader reader=new BufferedReader(isr); //보조문자 스트림
			
		// 4. 클라이언트의 OutputStream을 통해 보내온 데이터를 읽기
			while(true) {
				String msg=reader.readLine(); // 상대의 OutputStream에서 데이터를 보낼때까지 대기
				System.out.println("받은 메세지 : "+msg);
				if(msg==null)break;	 //상대의 outputStream이 close될때 null이됨		
			}
			//스트림 닫기
			reader.close();
			System.out.println("모든 통신 종료!");
		} catch (IOException e) {}
	}
	
	

}
