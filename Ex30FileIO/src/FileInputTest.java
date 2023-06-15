import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DrbgParameters.NextBytes;

public class FileInputTest {

	public static void main(String[] args) {
		
		//읽어올 파일의 파일명을 관리하는 객체 생성
		File file=new File("aaa.txt");
		
		// 파일과 연결된 무지개로드(Stream)만들기
		// 그중에서 File전용이며 데이터를 읽어오는 Stream: FileInputStream
		try {
			//해당 파일이 없으면 Exception 발생
			FileInputStream fis=new FileInputStream(file);
			
			// 스트림을 통해 파일에서 데이터 읽어오기
//			byte b=(byte)fis.read(); //파일에서 1바이트만 읽어옴..반복문 필요함
//			while(b!=-1) { //read에서 읽을게 없을때 -1을 보냄
//				//System.out.println(b); //글씨의 아스키값을 출력함
//				System.out.print((char)b);
//				b=(byte)fis.read();  //자동으로 다음 한 바이트를 읽어옴
//			}
//			System.out.println();
			
			// 위 방식으로 읽어오면 아스키에 없는 문자들을 이상하게 출력됨
			
			// 1바이트씩 읽지 말고.. 바이트배열 덩어리로 한방에 읽어오기
			// 스트림으로 읽어온 바이트배열 덩어리를 저장할 빈 배열이 준비되어있어야함
			byte[] bytes=new byte[1024];// 1KB빈상자
			fis.read(bytes); //byte배열안에 데이터를 넣어줌
			
			// byte[]배열을 String객체로 변환
			String s=new String(bytes);
			System.out.println(s);
			
			System.out.println("파일로드가 종료되었습니다");
			//스트림 닫기
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽기과정 중 오류가 발생했습니다");
		}
		
	}
	
	
}
