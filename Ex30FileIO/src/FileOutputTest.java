import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {
	
	public static void main(String[] args) {
		
		// 사용자로부터 데이터를 입력받아 File에 저장하는 프로그램
		Scanner scan=new Scanner(System.in);
		System.out.print("저장할 데이터를 입력하세요 : ");
		String data=scan.next();
		data=data+"\n";
		// 데이터를 영구적으로 저장할 HDD(하드디스크)는 File형태로 데이터 저장
		// 먼저 File을 제어하는 클래스 객체로생성
		 //파일이 저장된 경로(폴더)를 지정하지 않으면 자동 현재 프로젝트 폴더에 file이 저장됨
		
		// 파일이 저장될 경로 지정해보기
		//file=new File("kkk\\aaa.txt"); //windows에서는 역슬래시(\)가 폴더구분자. [단, 문자열""안에서는 \를 특수문자로 보기에 2번써야 \로인식]
		//file=new File("kkk/aaa.txt");//MacOs or Linux는 경로구분자로 슬래시를 사용함[단 windows는 슬래시도 됨]
		
		// 폴더가 없으면 자동생성이 안되기에 
		// 프로그램으로 폴더 만들어보기
		//File path=new File("kkk"); 		
		//if(!path.isDirectory()) {
		//	path.mkdirs(); //하위폴더가 있다면 같이 만들어줌
		//}
		
		//내 프로젝트가 아니라 HDD의 특정 파티션 영역사용
		File path=new File("D:/files/kkk");
		if(!path.isDirectory()) path.mkdirs();
		// 만들어진 폴더와 파일명을 결합
		File file=new File(path,"data.txt");
		
		// 파일객체가 관리하는 경로의 파일에 데이터를 보내기위해 무지개로드(Stream) 생성
		// Stream중에서 내보내는 방향의 OutputStream사용
		// 그 중에서도 파일 전용으로 설계된 FileOutputStream클래스로 객체 생성
		try {
			//만약 파일이 없다면 자동으로 만들어줌. 있다면 그 파일을 열기만 함[단, 폴더는 자동생성 못함]
			//FileOutputStream fos=new FileOutputStream(file);  //기본 덮어쓰기 모드
			FileOutputStream fos=new FileOutputStream(file,true);
			
			// 스트림을 통해 데이터를 내보내기(파일 저장)
			// fos.write(65); //유니코드번호를 전달 : 'A'문자
			// 문자열 데이터를 보내보기
			byte[] bytes=data.getBytes();
			fos.write(bytes);
			fos.flush(); //Stream버퍼에 찌꺼기가 남아있을 수 있어서 비우도록(물내리기)
			
			//언제나 스트림 작업이 끝나면 스트림 연결을 닫는 작업요청
			fos.close();
			
			System.out.println("파일 저장 성공");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			System.out.println("쓰기작업 중 오류가 발생했습니다");
		}
	}
}
