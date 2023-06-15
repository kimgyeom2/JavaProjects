import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// UDP : User Datagram protocal - 마치 택배보내기와 비슷-속도빠른 방식
				
		try {
			// 1. 우편보낼 우체통 만들기
			DatagramSocket socket=new DatagramSocket();
			
			// 보낼 데이터
			Scanner scan=new Scanner(System.in);
			System.out.print("보낼 데이터를 입력하세요 : ");
			String msg=scan.nextLine();
			
			// 2. 보낼데이터(msg)를 우편으로 보내기 위해 택배상자(DatagramPacket)만들기
			InetAddress addr=InetAddress.getByName("172.30.1.35"); //받는사람주소로 InetAddress객체 생성 (택배송장)
			DatagramPacket packet=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
	
			// 3. 우체통에 택배박스 넣어서 보내기
			socket.send(packet);
			System.out.println("전송 완료");
			
		} catch (SocketException e) {
		} catch (UnknownHostException e) {			
		} catch (IOException e) {}
	}

}
