package cpsc433;

import java.awt.List;
import java.util.ArrayList;

public class Person {

	public String name;
	public ArrayList<String> role;
	public Boolean smokes;
	public Boolean hacker;
	
	public Person(String n){
		this.name = n;
	}
	
	public Person(String n, String r){
		this.name = n;
		if (this.role == null){
			this.role = new ArrayList<String>();
			this.role.add(r);
		}
		else{
			this.role.add(r);
		}
	}
}
