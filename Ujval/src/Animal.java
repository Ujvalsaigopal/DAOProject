
abstract class Animal{
	public String name;
	public  Animal(String name){
		this.name= name;
	}
	public String speak(){
		return name + "says" + sound();
			}
public abstract String sound();
}
class Cow extends Animal{
	 public Cow(String name) {
	        super(name);
	    }
	    @Override public String sound() {
	        return "mooo";
	    }}
class Horse extends Animal{
	public Horse(String name){
		super(name);
	}
	@Override public String sound(){
		return "Hihaa";
	}
		}
 class Demo{
	public static void main(String[] args){
		
		Animal c= new Cow("Laxmi");
		System.out.println(c.speak());
	}
}


