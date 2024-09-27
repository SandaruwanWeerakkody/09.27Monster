public class StoneMonster extends Monster{
	private String name;
	
	public StoneMonster(String name){
		super(name);
	}
	public String attack(){
		return "attacked with Stone";
	}
}
