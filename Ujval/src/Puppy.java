public class Puppy{
	int puppyage;
	
	public Puppy(String name){
	System.out.println("Puppy Name"+ name);
		}
	public void puppyage(int age){
		puppyage = age;
			}
public int getpuppyage() {
	System.out.println("Age"+ puppyage);
	return puppyage;
	}
 public static void main(String[] args){
 Puppy mypuppy= new Puppy("tommy");
 
 mypuppy.puppyage(2);
 mypuppy.getpuppyage();
 System.out.println(mypuppy.puppyage);
 }
}


