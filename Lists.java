import java.util.Scanner;
import java.util.ArrayList;

class Lists {
	public static final int ADD_ITEM = 1;
	public static final int REMOVE_ITEM = 2;
	public static final int TERMINATE = 3;
	
    public static ArrayList<String> Todos = new ArrayList<String>();

    public static void main(String[] args) {
		Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == ADD_ITEM) {
					addItem();
                }
                else if(mode == REMOVE_ITEM) {
					removeItem();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
	}

	public static void addItem() {
		//TODO: Implement the add item function
	     scanner scan; 
        scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter the Index you'd like to add:");
            if (scan.hasNextInt()){
                int adds=scan.nextInt();
                ArrayList.add(adds);
            }
        }
    }

	public static void removeItem() {
		//TODO: Implement the remove item function
        removeItem();
            scanner scan; 
            scan = new Scanner(System.in);
            while(true){
                System.out.print("Enter the Index you'd like to remove:");
                if (scan.hasNextInt()){
                    int idx=scan.nextInt();
                    ArrayList.remove(idx);
                }
            }
        
	}

	public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Enter Item\n"
            + "\t(2) Remove Item\n"
            + "\t(3) Quit\n"
        );
    }
}
