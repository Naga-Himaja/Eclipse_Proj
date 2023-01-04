package Video_Module;
import java.util.*;
public class VideoStore {
	private HashMap<String, Video> store = new HashMap<String, Video>();
	void addVideo(String name){
		Video v = new Video(name);
		//System.out.println(v.toString());
		v.videoId = (int)(Math.random()*10) +v.toString().substring(19,23)+name.charAt(0)+v.toString().substring(23);
		store.put(v.videoId, v);
		System.out.println("Video \""+name+"\" added successfully!");
		System.out.println("The ID of the video is : "+v.videoId);
	}
	void doCheckOut(String Id){
		try{
System.out.println(store.get(Id));
			store.get(Id).doCheckout();
			System.out.println("Video \""+store.get(Id).getName()+"\" checked out successfully!");
		}
		catch(Exception e){
			//System.out.println(e);
			System.out.println("No such video exists in our store! ");
		}
	}
	void doReturn(String Id){
		try{
			Video v = store.get(Id);
			v.doReturn();
			System.out.println("Video \""+store.get(Id).getName()+"\" returned successfully!");
		}
		catch(Exception e){
			System.out.println("No such video was taken from our store!");
		}
	}
	void receiveRating(String Id, int rating){
		try{
			Video v = store.get(Id);
			v.receiveRating(rating);
			System.out.println("Rating \""+rating+"\" has been mapped to the video \""+store.get(Id).getName() +"\".");
		}
		catch(Exception e){
			System.out.println("Invalid video name!");
		}
	}
	void listInventory(){
		System.out.println("-------------------------------------------------------------");
		System.out.println("Video ID\t|\tVideo Name\t|\tCheckout Status\t|\tRating");
		for(String v : store.keySet()){
			Video ob = store.get(v);
			System.out.println(ob.videoId+"\t|\t"+ob.getName()+"\t|\t"+ob.getCheckout()+"\t|\t"+ob.getRating());
		}
		System.out.println("-------------------------------------------------------------");
	}
}
