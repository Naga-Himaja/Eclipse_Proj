package Video_Module;
public class Video {
	private String videoName;
	String videoId;
	private boolean checkout;
	private int rating;
	Video(String name) {
		// TODO Auto-generated constructor stub
		this.videoName = name;
		this.checkout = false;
		this.rating = 0;
	}
	String getName(){
		return this.videoName;
	}
	void doCheckout(){
		this.checkout = true;
	}
	void doReturn(){
		this.checkout = false;
	}
	void receiveRating(int rate){
		this.rating = rate;
	}
	int getRating(){
		return this.rating;
	}
	boolean getCheckout(){
		return this.checkout;
	}
}
