package DAO;

import Main.Info;

public class DAO implements Info {
	private int id = 10;
	
	public void Name(String name) {
		System.out.println("Hello"+ name);
		}
	public void Showinfo(){
		System.out.println("You ID:");
	}
}
