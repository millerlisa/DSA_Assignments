package AssignmentSix;

public class Main {
	public static void main(String[] args) {
	AnimalShelter shelter = new AnimalShelter();

	shelter.enqueue(new Dog("Buddy"));
	shelter.enqueue(new Cat("Whiskers"));
	shelter.enqueue(new Dog("Rex"));
	shelter.enqueue(new Cat("Mittens"));

	System.out.println("Dequeued Any: " + shelter.dequeueAny().getName());  // Should return Buddy (oldest)
	System.out.println("Dequeued Dog: " + shelter.dequeueDog().getName());  // Should return Rex
	System.out.println("Dequeued Cat: " + shelter.dequeueCat().getName());  // Should return Whiskers
	System.out.println("Dequeued Any: " + shelter.dequeueAny().getName());  // Should return Mittens
	}
}

