package gcu.bootcamp.java.christina.herman.drwhotwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * create class Tardis inheriting DrsFriend
 * create ArrayList for real friends and enemies
 * import list and array list
 */
public class Tardis extends DrsFriend {
	//create scanner object
	private Scanner scanner = new Scanner(System.in);
	List<String> realFriends = new ArrayList<String>();
	List<String> enemies = new ArrayList<String>();

	// create attributes with access modifiers and types	
	private int whatYear; 
	private int DrWho; 
	
	/**
	 * create constructor for class pass in String name 
	 * @param calling class being extended 
	 */
	public Tardis(String name) {
		super(name);
	}
	/**
	 * create method to get attribute What year
	 * @return value of what year 
	 */
	public int getWhatYear() {
		return whatYear;
	}
	/**
	 * create method to set attribute what year to pass int value 
	 * @param set whatYear to value of what year 
	 */
	public void setWhatYear(int whatYear) {
		this.whatYear = whatYear;
	}
	/**
	 * create method to get attribute DrWho
	 * @return DrWho value 
	 */
	public int getDrWho() {
		return DrWho;
	}
	/**
	 * create method to set attribute DrWho to pass in int value
	 * @param set drWho to value of DrWho
	 */
	public void setDrWho(int drWho) {
		DrWho = drWho;
		//This is a test line 
	}
	// create method createListOfFriends and set value of String 
	private void createListOfFriends(){
		realFriends.add("Amy");
		realFriends.add("Rory");
		realFriends.add("Tardis");
	}
	/**
	 * create method findTheYear 
	 * @param pass value doctorNum
	 * @return year value
	 */
	public void findTheYear(int doctorNum) {
		DrWho doctor;
		doctor = buildDoctor(doctorNum);
		System.out.println("This is Doctor " + doctorNum+ ". His saying is " + drList.get(doctorNum).getCatchPhrase()
		+ " and the Earth year is "+ drList.get(doctorNum).getYear() + ".");		
	}
	
// Made changes to the case statements.  We shortened the code on the case statement and passed back an object to be used for 
// the display.
		List<DrWho> drList = new ArrayList<DrWho>();
	
		public void createDoctor() {
				
		drList.add(new DrWho(1, 2109, "Hmmm?",1963));
		drList.add(new DrWho(4, 2438, "When I say ‘run,’ run. … RUN!",1966));
		drList.add(new DrWho(3, 1353, "Reverse the polarity of the neutron flow",1970 ));
		drList.add(new DrWho(3, 3444, "Would you care for a Jelly Baby?", 1974));
		drList.add(new DrWho(3, 2143, "Sorry, must dash!",1982));
		drList.add(new DrWho(7, 6594, "Mmm, I wonder … Aha!",1984));
		drList.add(new DrWho(1, 5847, "Not this time…",1987));
		drList.add(new DrWho(3, 1294, "Who am I?",1996));
		drList.add(new DrWho(1, 1374,"Fantastic",2005));
		drList.add(new DrWho(2, 3478, "Allons-y", 2006));
		drList.add(new DrWho(3, 1375, "Bowties are Cool",2010));
		}
	
	/**
	 * create method isFriendOrFoe to pass in String friend value
	 * implement if statement to check if value will be friend or foe
	 * if friend add to list of friends
	 * else if enemy add to list of enemies
	 */
    @Override
    public boolean isFriendOrFoe(String friend) {
       	
            if(realFriends.contains(friend)) {
                System.out.println("Yes, they are a friend of the Dr.\nyou are on the following list of friends " 
                        + realFriends  +".");
                super.setFriendOrFoe(true);
                boolean isFriend = super.getFriendOrFoe();
                return isFriend; 
            }
            else if (!realFriends.contains(friend)) {
                System.out.println("Would you like to add " + friend+ " as a friend (1=Yes,\n"
                        + "any other number = NO)?");
                String choice = scanner.next();
                try{
              	  	int num = Integer.parseInt(choice);
	                if(choice.equals("1")) {
	                    realFriends.add(friend);
	                    Collections.sort(realFriends);
	                    System.out.println("Yes, they are a friend of the Dr.\nyou are on the following list of friends " 
	                            + realFriends  +".");
	                    super.setFriendOrFoe(true);
	                    boolean isFriend = super.getFriendOrFoe();
	                    return isFriend; 
                    }
		            else {
		                enemies.add(friend);
		            }	                
	               }
	               catch (NumberFormatException e) {
	                	 System.out.println("Please enter a number you numbnut.");
	               }      
        }
            super.setFriendOrFoe(false);
            boolean isNotFriend = super.getFriendOrFoe();
            return isNotFriend;           
    }
    
    // create method to display enemies list, implement if statement if no enemies are 
    // added print no enemies
    // if there is an enemy print String message
	private void displayEnemies() {
		if(enemies.isEmpty()) {
			System.out.println("There are no enemies.....");
		}
		else{
			System.out.println("Run its the enemy!!! \nEnemy List: " +enemies);
		}		
	}
	
	// create method displayFriends and print message with realFriends value
	private void displayFriends() {
	    System.out.println("The following is a list of friends "+ realFriends );
	  }
	// create method promptUserFourTimes implement for loop to prompt user to input names 
	// and if friend or foe 4 times
	  private void promptUserFourTimes() {
	    for(int i = 0; i<4; i++){
	      String name2 = getNames();
	      isFriendOrFoe(name2);
	      }
	  }
	  /**
	   * main() method to call object and instances and methods
	   * create object of class and set String value
	   * call methods and run program
	   */
	public static void main(String [] args) {
				
		Torchwood ally = new Torchwood("Jack Harkness");
		Tardis friend = new Tardis("T");
		friend.createDoctor();
		friend.createListOfFriends();
		Collections.sort(friend.realFriends);
		friend.promptUserFourTimes();
		int num = friend.getNumberFromUser();
		friend.findTheYear(num);
		friend.displayFriends();
		friend.displayEnemies();
		List<String>friends = ally.friendList();
		List<String>enemies = ally.enemyList();
		ally.displayFriendsList(friends);
		ally.displayEnemiesList(enemies);	
	}
	
	public DrWho buildDoctor(int doctorNum) {
		
		return null;
	}
}
