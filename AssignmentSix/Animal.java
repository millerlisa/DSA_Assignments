package AssignmentSix;

abstract class Animal {
    private String name;
    private int order;  // Represents the arrival time or "timestamp"

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    // Check if this animal is older than another
    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }
}





