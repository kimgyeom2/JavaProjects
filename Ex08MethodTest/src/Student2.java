import java.util.Scanner;

public class Student2 {
	
	Scanner scan=new Scanner(System.in);
	String name;
	int kor;
	int eng;
	double aver;
	void input() {
		name=scan.next();
		kor=scan.nextInt();
		eng=scan.nextInt();
	}
	
	void show() {
		System.out.println("이름 : "+ name);
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("평균 : "+ (double)(kor+eng)/2);
		System.out.println();
	}
}
