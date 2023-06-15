
public class Alba extends Student {
String task="";
	public Alba() {
		// TODO Auto-generated constructor stub
	}

	public Alba(String name, int age, String major,String task) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task=task;
	}

	public void show() {
		super.show();
		System.out.println("task: "+task);
		
	}
	
	
	}

