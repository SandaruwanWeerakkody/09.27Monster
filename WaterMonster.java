public class WaterMonster extends Monster{
	private String name;
	
	public WaterMonster(String name){
		super(name);
	}
	public String attack(){
		return "attacked with water";
	}
}
