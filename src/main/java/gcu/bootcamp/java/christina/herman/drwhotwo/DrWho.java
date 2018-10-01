package gcu.bootcamp.java.christina.herman.drwhotwo;

public class DrWho {
	private int howManyFriends; 
	private String catchPhrase; 
	private int age; 
	private final String NAME = "Dr Who";
	private int numberOfDr; 
	private int year; 
	
	
	public int getHowManyFriends() {
		return howManyFriends;
	}
	public void setHowManyFriends(int howManyFriends) {
		this.howManyFriends = howManyFriends;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNAME() {
		return NAME;
	}
	public int getNumberOfDr() {
		return numberOfDr;
	}
	public void setNumberOfDr(int numberOfDr) {
		this.numberOfDr = numberOfDr;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public DrWho(int friends, int age, String catchPhrase) {
		this.age= age;
		this.howManyFriends= friends; 
		this.catchPhrase = catchPhrase; 
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	


}
