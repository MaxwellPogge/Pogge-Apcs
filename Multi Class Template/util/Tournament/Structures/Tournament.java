package structures;
import java.util.List;
import java.util.ArrayList;

public class Tournament {
	private Player[] slots;
	private List<String> waitingList;

	public Tournament() {
		//init player array and waiting list 
		slots = new Player[100]; 	 
		List <player> L= new ArrayList <PLayer>();
	}

	public Player requestSlot(String playerName) {
        //implement the request slot function
		for (int i=0; i<slots.length; i++)
		if (slots[i] == null){
		public player requestSlot(String name);
		return player;
		//create player 

		}
		
    }

	public Player cancelAndReassignSlot(Player p) {
		
		//implement the cancelAndReassignSlot function
	}

	@Override
	public String toString() {
		//return a string representation of all data in the Tournament
		String output = ""; 
		//fill it


		return output; 
	
	}
}