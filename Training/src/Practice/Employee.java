package Practice;

public class Employee {
private String name;
private int num;
private int age;




public  Employee(String name,int num,int age) {
	this.name=name;
	this.age=age;
	this.num=num;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getNum() {
	return num;
}


public void setNum(int num) {
	this.num = num;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}




}
