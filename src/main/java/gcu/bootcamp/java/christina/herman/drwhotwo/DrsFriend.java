package gcu.bootcamp.java.christina.herman.drwhotwo;
// import scanner for user input
import java.util.Scanner;

/**
 * create abstract class for DrsFriend to allow creation of sub class abstract methods
 * create object of scanner to get user input 
 * create attributes 
 */
public abstract class DrsFriend {
	private Scanner scanner = new Scanner(System.in);

	private String friendName; 
	private boolean isFriendOrFoe;


	/**
	 * create method to get FriendName 
	 * @return get value in attribute
	 */
	public String getFriendName() {
		return friendName;
	}
	/**
	 * create method to set FriendName 
	 * @param set attribute friendName and return a value 
	 */
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	/**
	 * create method to set FriendOrFoe
	 * @return attribute value of FriendOrFor
	 */
	public boolean getFriendOrFoe() {
		return isFriendOrFoe;
	}
	/**
	 * create method to set FriendOrFoe
	 * @param set attribute isFriendOrFoe and return a value
	 */
	public void setFriendOrFoe(boolean isFriendOrFoe) {
		this.isFriendOrFoe = isFriendOrFoe;
	} 
	/**
	 * create constructor to set DrsFriend
	 * @param set attribute value of Friend name
	 */
	public DrsFriend(String name) {
		this.friendName= name; 

	}
	/**
	 * create method getNames set Sting to null and implement a while loop with a try catch 
	 * @return name value 
	 */
	public String getNames() {
		String name = null;  
		while(true){
			try{
				System.out.println("Enter the name of Dr Who's friend: ");
				name = scanner.nextLine();
				Integer.parseInt(name);
			}
		catch(NumberFormatException e) {
			return name; 
		}
		
		}
	}
	/**
	 * create method getNumberFromUser prompt user to enter an int set int num = scanner nextInt
	 * @return num value
	 */
	public int getNumberFromUser() {
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		return num; 
	}
	/**
	 * create abstract method isFriendOrFoe to pass in a string 
	 * @param friend name value and return boolean expression
	 * @return friend value and if friend or foe
	 */
	public abstract boolean isFriendOrFoe(String friend);

}
