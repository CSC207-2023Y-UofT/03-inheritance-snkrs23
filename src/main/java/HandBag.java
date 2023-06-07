public class HandBag extends Bag{

    /**
     * Creates a new bag with the given color and
     * capacity.
     *
     * @param color color of the bag.
     * @param capacity capacity of the bag.
     */
    public HandBag(String color, int capacity) {
        super(color, capacity);
    }

    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(1);
    }
}
