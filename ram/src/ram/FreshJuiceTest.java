package ram;

import ram.FreshJuice.Freshjuicesize;

public class FreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice= new FreshJuice();
		juice.size= FreshJuice.Freshjuicesize.medium;
		System.out.println("size :"+ juice.size );
	}

}
