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
	public int findTheYear(int doctorNum) {
		switch (doctorNum) {
		case 1:
			doctorNum=1; 
			DrWho doctor1 = new DrWho(1, 2109, "Hmmm?");
			doctor1.setYear(1963);
			int year1 = doctor1.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor1.getCatchPhrase()
			+ " and the Earth year is "+ year1 + ".");
			return year1; 
		case 2:
			doctorNum=2; 
			DrWho doctor2 = new DrWho(4, 2438, "When I say ‘run,’ run. … RUN!");
			doctor2.setYear(1966);
			int year2 = doctor2.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor2.getCatchPhrase()
			+ " and the Earth year is "+  year2 + ".");
			return year2; 
		case 3:
			doctorNum=3; 
			DrWho doctor3 = new DrWho(3, 1353, "Reverse the polarity of the neutron flow");
			doctor3.setYear(1970);
			int year3 = doctor3.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor3.getCatchPhrase()
			+ " and the Earth year is "+  year3 + ".");
			return year3;
		case 4:
			doctorNum= 4; 
			DrWho doctor4 = new DrWho(3, 3444, "Would you care for a Jelly Baby?");
			doctor4.setYear(1974);
			int year4 = doctor4.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor4.getCatchPhrase()
			+ " and the Earth year is "+ year4+ ".");
			return year4; 
		case 5:
			doctorNum=5; 
			DrWho doctor5 = new DrWho(3, 2143, "Sorry, must dash!");
			doctor5.setYear(1982);
			int year5 = doctor5.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor5.getCatchPhrase()
			+ " and the Earth year is "+ year5 +".");
			return year5;
		case 6:
			doctorNum=6; 
			DrWho doctor6 = new DrWho(7, 6594, "Mmm, I wonder … Aha!");
			doctor6.setYear(1984);
			int year6 = doctor6.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor6.getCatchPhrase()
			+ " and the Earth year is "+ year6 +".");
			return year6; 
		case 7:
			doctorNum=7; 
			DrWho doctor7 = new DrWho(1, 5847, "Not this time…");
			doctor7.setYear(1987);
			int year7 = doctor7.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor7.getCatchPhrase()
			+" and the Earth year is "+ year7+  ".");
			return year7;
		case 8:
			doctorNum=8; 
			DrWho doctor8 = new DrWho(3, 1294, "Who am I?");
			doctor8.setYear(1996);
			int year8 = doctor8.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor8.getCatchPhrase()
			+ " and the Earth year is "+ year8 +  ".");
			return year8; 
		case 9:
			doctorNum=9; 
			DrWho doctor9 = new DrWho(1, 1374,"Fantastic");
			doctor9.setYear(2005);
			int year9 = doctor9.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor9.getCatchPhrase()
			+" and the Earth year is "+ year9+  ".");
			return year9; 
		case 10:
			doctorNum=10; 
			DrWho doctor10 = new DrWho(2, 3478, "Allons-y");
			doctor10.setYear(2006);
			int year10 = doctor10.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor10.getCatchPhrase()
			+ " and the Earth year is "+ year10+  ".");
			return year10; 
		case 11:
			doctorNum=11; 
			DrWho doctor11 = new DrWho(3, 1375, "Bowties are Cool");
			doctor11.setYear(2010);
			int year11 = doctor11.getYear();
			System.out.println("This is Doctor " + doctorNum+ ". His saying is " +doctor11.getCatchPhrase()
			+ " and the Earth year is "+ year11 + ".");
			return year11; 
		default: 
		System.out.println("There are no more Doctors");
		return 0; 
		 
		}
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
                int choice = scanner.nextInt();
                if(choice ==1) {
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
		Tardis friend = new Tardis("T");
		friend.createListOfFriends();
		Collections.sort(friend.realFriends);
		friend.promptUserFourTimes();
		int num = friend.getNumberFromUser();
		friend.findTheYear(num);
		friend.displayFriends();
		friend.displayEnemies();
		
		
	}
}
