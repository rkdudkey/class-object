package Homework;


public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	Pet(){
		
	}
	
	Pet(String name, int age, String location, String type){
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public static void main(String[] args) {
		Pet myPet = new Pet("moomoo", 5, "thailand", "poodle"); 
		
		System.out.println(myPet.getName());
		System.out.println(myPet.getAge());
		System.out.println(myPet.getType());
		
		myPet.setName("mee mee");
		myPet.setAge(10);
		myPet.setLocation("foxboro ma");
		
		System.out.println(myPet.getName());
		System.out.println(myPet.getAge());
		System.out.println(myPet.getLocation());
	}
	
	
}
