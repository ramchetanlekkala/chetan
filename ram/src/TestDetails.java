
public class TestDetails {

	public static void main(String[] args) {
		Student s1= new Student("ram",123, 10, 20, 30, 40);
		Student s2= new Student("chetan",1234, 30, 70, 60, 40);
		Student s3= new Student("sam",12345, 10, 50, 40, 20);
		System.out.println("name :"+ s1.name);
		System.out.println("student id number :"+ s1.id);
		s1.average();
		s2.average();

	}

}
