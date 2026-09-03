package corepart.day2;

class demo{
	int age = 3;
	public void eligibilty() {
		if(age>18)
		{
			System.out.println("eligible for voting");
		}else {
			System.out.println("not eligible for voting");
		}
	}
}
public class Ifelseprogram {

	public static void main(String[] args) {
		
		demo d = new demo();
		d.eligibilty();

	}

}
