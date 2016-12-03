package pierwszy;

public abstract class Maszyna {

protected static String prywatny = "nie zobaczysz mnie";
	public void inMaszyna(){
		System.out.println(this.getClass().getName() +  " Jestem w Maszynie!");
	}
	
	public int testOverload(){
		int i = 0;
		return i;
		
	}


	
	public int getWeight(){
		return 0;
	}
}
