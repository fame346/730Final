package Q5;

public class Q5 {

	private static SingletonJoke instance;
	private String Joke;
	private SingletonJoke() {
		Joke = "US Politics. That is the joke"
	}
	public static SingletonJoke getInstance() {
		if (instance == null){
			instance = new SingletonJoke();
	}
	return instance; 
	}
	public String SingletonJoke()
	{
		return SingletonJoke;
	}
}