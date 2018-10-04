package gcu.bootcamp.java.christina.herman.drwhotwo;

import java.util.ArrayList;
import java.util.List;

public class Torchwood extends DrsFriend {

	
	private String friends;
	private String enemies;

/**
 * 
 * @return
 */
	public List <String> friendList(){
		List <String> friends = new ArrayList<String>();
		friends.add("John Hart");
		friends.add("Angelo Colasanto");
		friends.add("Estelle Cole");
		friends.add("Lucia Moretti");
		friends.add("Ianto Jones");
		return friends;
	}
	
/**
 * 
 * @return
 */
	public List <String> enemyList(){
		List <String> enemies = new ArrayList<String>();
		enemies.add("Daleks");
		enemies.add("Cybermen");
		enemies.add("Reapers");
		return enemies;
	}
	
/**
 * 
 * @param list
 */
	public void displayFriendsList (List<String> list) {
		System.out.println("The Doctor has other allies to help him in his journey");
		System.out.println("Torchwood allies are " + list + " .");
	}

/**
 * 
 * @param list
 */
	public void displayEnemiesList (List<String> list) {
		System.out.println("Its seems that the Doctor's enemies are also Torchwood's enemies");
		System.out.println("Torchwood enemies are " + list + " .");
	}
	
	public String getFriends() {
		return friends;
	}

	public void setFriends(String friends) {
		this.friends = friends;
	}

	public String getEnemies() {
		return enemies;
	}

	public void setEnemies(String enemies) {
		this.enemies = enemies;
	}

	public Torchwood(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFriendOrFoe(String friend) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
