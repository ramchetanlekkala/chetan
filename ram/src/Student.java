
public class Student {
	String name;
	int id;
	int maths;
	int physics;
	int science;
	int chemistry;
	
	
	public Student(String name, int id, int maths, int physics, int science, int chemistry) {
		super();
		this.name = name;
		this.id = id;
		this.maths = maths;
		this.physics = physics;
		this.science = science;
		this.chemistry = chemistry;
	}

	public void average() {
		int i= getMaths();
		int j= getPhysics();
		int k= getScience();
		int l= getChemistry();
		float avg= (i+j+k+l)/4;
		System.out.println("average of four subjects is :"+ avg);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}


	public int getChemistry() {
		return chemistry;
	}


	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	
	
	
	

}
