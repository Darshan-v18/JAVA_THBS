package Practice;


public class Dogs {
	private String name;
	private String breed;
	
	
	public Dogs(String name, String breed) {

		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {
		Dogs d1 =new Dogs("abc","labradour");
		Dogs d2 = new Dogs("cde","golden retriever");
		System.out.println(d1.getName()+" " +d1.getBreed());
		System.out.println(d2.getName()+" " +d2.getBreed());
		
		
		d1.setName("rocky");
		d2.setBreed("Bull dog");
		
		
		System.out.println(d1.getName()+" " +d1.getBreed());
		System.out.println(d2.getName()+" " +d2.getBreed());
	}

}
