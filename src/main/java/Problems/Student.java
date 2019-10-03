package Problems;

public class Student {
  String name;
  int sclass;
  float result;
  
public String getName() {
	return name;
}

public Student(String name, int sclass) {
	super();
	this.name = name;
	this.sclass = sclass;
	System.out.println("Added student: "+this.name+" to the roll of class: "+this.sclass);
}

public String publish() {
	
	if(this.result >= (float)33.33) {
		return this.name+" has been promoted to class "+this.sclass+1;
	}
	return this.name+" has been retained in class "+this.sclass;
	
}
 
  
  
}
