package Class3;

public class Student {
	int stId;
	String stName;
	//Creating Has-A relationship with Address class between student/address class
	Address studentAddr;
	
	Student(int id, String name, Address addr){
		this.stId = id;
		this.stName = name;
		this.studentAddr = addr;
	}
	public static void main(String[] args) {
		Address ad = new Address(55,"ABC","VA","USA");
		Student stu = new Student(123,"John",ad);
		System.out.println(stu.stId);
		System.out.println(stu.stName);
		System.out.println(stu.studentAddr.streetNum);
		System.out.println(stu.studentAddr.city);
		System.out.println(stu.studentAddr.state);
		System.out.println(stu.studentAddr.country);
	}

}
