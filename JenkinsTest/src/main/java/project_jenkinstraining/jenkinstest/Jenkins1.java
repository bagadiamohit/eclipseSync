package project_jenkinstraining.jenkinstest;

public class Jenkins1 {
	
	static int empID;
	static int age;
	static double salary;
	static double vpay;
	
	public static void main(String[] args){
		Jenkins1 j = new Jenkins1();
		j.empID=10002;
		j.age=25;
		j.salary=2345.45;
		j.vpay=231.23;
		System.out.println("Emp ID is: "+empID);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
		System.out.println("Variable pay is: "+vpay);
		System.out.println("Hello all");
	}

}
