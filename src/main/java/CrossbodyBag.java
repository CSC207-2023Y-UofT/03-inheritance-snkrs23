public class CrossbodyBag extends Bag {
        public int numberOfStraps;
        public CrossbodyBag(String color, int capacity, int numberOfStraps){
            super(color, capacity);
            this.numberOfStraps = numberOfStraps;
        }
        public int getNumberOfStraps(){
            return this.numberOfStraps;
        }

        @Override
        public void enhance() {
            super.increaseCapacity(2);
        }

        @Override
        public String toString() {
            return super.getColor() + " Crossbody Bag (" + this.getNumberOfStraps() + " straps " + super.getNumberOfContents() +
                " " + super.getCapacity() + ")";
        }
}
