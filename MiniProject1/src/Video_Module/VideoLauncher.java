package Video_Module;
import java.util.*;
public class VideoLauncher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VideoStore st = new VideoStore();
		while(true){
			System.out.println("\nMAIN MENU");
			System.out.println("=========\n");
			System.out.println("1. Add Video\n2. Check Out Video\n3. Return Video\n4. Receive Rating\n5. List Inventory\n6. Exit");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch){
				case 1: System.out.print("\nEnter the name1 of the video you want to add: ");
				sc.nextLine();
				st.addVideo(sc.nextLine()); break;
				
				case 2: System.out.print("\nEnter the ID of the movie you want to checkout: ");
				sc.nextLine();
				st.doCheckOut(sc.nextLine()); break;
				
				case 3: System.out.print("\nEnter the ID of the video you want to return: ");
				sc.nextLine();
				st.doReturn(sc.nextLine()); break;
				
				case 4: System.out.print("\nEnter the ID of the video you want to rate: ");
				sc.nextLine();
				String str = sc.nextLine();
				System.out.print("Enter the rating for this video: ");
				int rating = sc.nextInt();
				st.receiveRating(str, rating); break;
				
				case 5: st.listInventory(); break;
				
				case 6: System.out.println("\nExiting...!! Thanks for using the application."); 
						sc.close(); return;
			}
		}
	}
}
