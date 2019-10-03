package Problems;

public class Result extends Student {
	
	int subject1;
	int subject2;
	int subject3;
	

	public Result(String name, int sclass) {
		super(name, sclass);
		
	}

	public Result(int a, int b, int c, String s, int sclass) {
		
		super(s, sclass);
		this.subject1 = a;
		this.subject2 = b;
		this.subject3 = c;
		
		System.out.println(this.name+" obtained"+this.subject1+" subject1");
		System.out.println(this.name+" obtained"+this.subject2+" subject2");
		System.out.println(this.name+" obtained"+this.subject3+" subject3");
	}
	
	public String calculateResult() {
		this.result = ((this.subject1 + this.subject2 + this.subject3) * 100)/300;
		return this.publish();
	}
	
	public String changeMarks(int newMarks, String subject) {
		
		System.out.println(this.name+" has orderd a recheck in "+subject);
		if(subject.equals(String.valueOf(this.subject1))) {
			this.subject1 = newMarks;
		}else if(subject.equals(String.valueOf(this.subject2))) {
			this.subject2 = newMarks;
		}else {
			this.subject3 = newMarks;
		}
		
		String string = calculateResult();
		return "Following is the new result: "+string;
	}

}
