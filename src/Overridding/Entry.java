package Overridding;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		//a.Animalsound();
		MakeSound(a);
		Dog d =new Dog();
	     //d.Animalsound();
		MakeSound(d);// dog is child of animal,dog reference to ----animal a
		
	     
	     Pig p=new Pig();
	    // p.Animalsound();
	    MakeSound(p);
	    
	    
	    Lion l=new Lion();
	    MakeSound(l);
	    
	    
	    
	    Animal a1=new Pig();
	    a1.Animalsound();
	    
	    
	     
	     
	}
	public static void MakeSound(Animal a)
    {
   	 a.Animalsound();
    }
	




}
