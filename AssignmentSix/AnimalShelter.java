package AssignmentSix;

import java.util.LinkedList;

class AnimalShelter {
    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;
    private int order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;  // Initialize the order counter
    }

    // Enqueue an animal
    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    // Dequeue any (oldest animal)
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) return null;
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();

        // Choose the oldest between the first dog and cat
        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();
        
        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    // Dequeue dog
    public Dog dequeueDog() {
        if (dogs.isEmpty()) return null;
        return dogs.poll();
    }

    // Dequeue cat
    public Cat dequeueCat() {
        if (cats.isEmpty()) return null;
        return cats.poll();
    }
}