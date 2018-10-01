package gcu.bootcamp.java.christina.herman.drwhotwo;

import java.util.Scanner;

import gcu.bootcamp.java.christina.herman.drwhotwo.DrWho;

public abstract class DrsFriend {
	private Scanner scanner = new Scanner(System.in);

	private DrWho name; 
	private String friendName; 
	private boolean isFriendOrFoe;

	
	public DrWho getName() {
		return name;
	}
	public void setName(DrWho name) {
		this.name = name;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public boolean isFriendOrFoe() {
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
