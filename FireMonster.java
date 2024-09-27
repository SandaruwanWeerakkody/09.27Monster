public class FireMonster extends Monster{
	private String name;
	
	public FireMonster(String name){
		super(name);
	}
	public String attack(){
		return "attacked with fire";
	}
}
