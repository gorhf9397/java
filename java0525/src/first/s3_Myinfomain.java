package first;

public class s3_Myinfomain {

	public static void main(String[] args) {
		s3_Myinfo m=new s3_Myinfo();
		
		
		m.setHakbun("123456");
		String hakbun=m.getHakbun();
		System.out.println(hakbun);
		
		m.setName("123456");
		String name=m.getName();
		System.out.println(name);
		
		m.setAge(123456);
		int age=m.getAge();
		System.out.println(age);
		
		m.setPhone("123456");
		String phone=m.getPhone();
		System.out.println(phone);
		
		m.setNumber(123456);
		int number=m.getNumber();
		System.out.println(number);

	}

}
