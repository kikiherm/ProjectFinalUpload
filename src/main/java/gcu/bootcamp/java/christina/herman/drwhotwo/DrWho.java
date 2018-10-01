package gcu.bootcamp.java.christina.herman.drwhotwo;

public class DrWho {
	// create attribute with access modifiers and types
	private int howManyFriends; 
	private String catchPhrase; 
	private int age; 
	private final String NAME = "Dr Who";
	private int numberOfDr; 
	private int year; 
	
	/**
	 * create method getHowManyFriends attribute
	 * @return howManyFriends value
	 */
	public int getHowManyFriends() {
		return howManyFriends;
	}
	/**
	 * create method to set attribute HowManyFriends
	 * @param set attribute howManyFriends to a int value 
	 */
	public void setHowManyFriends(int howManyFriends) {
		this.howManyFriends = howManyFriends;
	}
	/**
	 * create method to get attribute Age
	 * @return value age 
	 */
	public int getAge() {
		return age;
	}
	/**
	 * create method to set attribute Age
	 * @param set age to value age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * create method to get attribute Name
	 * @return return name value 
	 */
	public String getNAME() {
		return NAME;
	}
	/**
	 * create method to get attribute NumberOfDr
	 * @return numberOfDr value 
	 */
	public int getNumberOfDr() {
		return numberOfDr;
	}
	/**
	 * create method to set attribute NumberOfDr
	 * @param set numberOfDr to value of numberOfDr
	 */
	public void setNumberOfDr(int numberOfDr) {
		this.numberOfDr = numberOfDr;
	}
	/**
	 * create method to get attribute CatchPhrase
	 * @return value of catch phrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}
	/**
	 * create method to set attribute CatchPhrase
	 * @param set catchPhrase to value of CatchPhrase
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	/**
	 * create constructor of class and pass in friends value, age and catch phrase 
	 * @param set friends to value of friends
	 * @param set age to value of age
	 * @param set catchPhrase to value of catch phrase
	 */
	public DrWho(int friends, int age, String catchPhrase) {
		this.age= age;
		this.howManyFriends= friends; 
		this.catchPhrase = catchPhrase; 
	}
	/**
	 * create method to get attribute year 
	 * @return year value
	 */
	public int getYear() {
		return year;
	}
	/**
	 * create method to set attribute year
	 * @param set year to value of year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	


}
