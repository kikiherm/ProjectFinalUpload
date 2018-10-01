package gcu.bootcamp.java.christina.herman.drwhotwo;

import java.util.Scanner;


public abstract class DrsFriend {
	private Scanner scanner = new Scanner(System.in);


	private String friendName; 
	private boolean isFriendOrFoe; 

	
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public boolean getFriendOrFoe() {
		return isFriendOrFoe;
	}
	public void setFriendOrFoe(boolean isFriendOrFoe) {
		this.isFriendOrFoe = isFriendOrFoe;
	} 
	
	public DrsFriend(String name) {
		this.friendName= name; 

	}
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
	public int getNumberFromUser() {
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		return num; 
	}
	
	public abstract boolean isFriendOrFoe(String friend);

}
