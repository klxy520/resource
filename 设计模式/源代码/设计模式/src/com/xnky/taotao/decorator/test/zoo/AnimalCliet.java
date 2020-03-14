package com.xnky.taotao.decorator.test.zoo;

public class AnimalCliet {

	public static void main(String[] args) {
	    Zoo zoo= new Bird();
	   zoo= new FlyAinmal(zoo);
	   zoo.show();
	   Zoo wolf = new Wolf();
	  wolf= new LandAnimal(wolf);
	  wolf.show();
	}

}
