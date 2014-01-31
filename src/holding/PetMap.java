//: holding/PetMap.java

import static net.mindview.util.Print.print;

import java.util.HashMap;
import java.util.Map;

import pets.Cat;
import pets.Dog;
import pets.Hamster;
import pets.Pet;

public class PetMap {

    public static void main(String[] args) {
	Map<String, Pet> petMap = new HashMap<String, Pet>();
	petMap.put("My Cat", new Cat("Molly"));
	petMap.put("My Dog", new Dog("Ginger"));
	petMap.put("My Hamster", new Hamster("Bosco"));
	print(petMap);
	Pet dog = petMap.get("My Dog");
	print(dog);
	print(petMap.containsKey("My Dog"));
	print(petMap.containsValue(dog));
    }

}
