public class TestMonster{
	public static void main (String args[]){
		Monster m1 = new FireMonster("Max");
		Monster m2 = new WaterMonster("Max");
		Monster m3 = new StoneMonster("Max");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		m1 = new StoneMonster("hi");
		System.out.println(m1.attack());
		
		/*Monster m4 = new Monster("dhsuj");
		System.out.println(m4.attack());*/
	}
}
