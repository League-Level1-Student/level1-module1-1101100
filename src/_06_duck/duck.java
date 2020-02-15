package _06_duck;

public class duck {
	
	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("quack " + numberOfFriends + " " + favoriteFood);
	}
	void waddle() {
		System.out.println("waddle " + numberOfFriends + " " + favoriteFood);
	}
	
	duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	

}

