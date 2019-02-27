ackage com.design.composite;

import java.util.ArrayList;

interface Components
{
	
   void prize();	
}

 class Leaf implements Components
{
	  int prize;
	    public Leaf(int prize, String name) {
		super();
		this.prize = prize;
		this.name = name;
	}

		String name;
    
	@Override
	public void prize() {
	     System.out.println(name + ";" + prize);	
	}

}

class Composite implements Components
{
	String name;
    public Composite(String name) {
		super();
		this.name = name;
	}

	ArrayList<Components> components = new ArrayList<>();
    
    public void addComponents(Components com) {
    	components.add(com);
    }
    
	@Override
	public void prize() {
		System.out.println(name);
		for(Components c : components) 
		{
			c.prize();
		}
	}
	
}
