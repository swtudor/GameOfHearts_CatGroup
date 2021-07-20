import java.util.Objects;
public class Cards {

    // value, suit
        String value;
        Type suit;

        public static enum Type {
            HEARTS, SPADES, DIAMONDS, CLUBS
        }
        final String[] valuesystem = new String[]{
                "2","3","4","5","6","7","8","9","10","J","Q","K","A"
        } ;

        public Cards(String value, Type suit) {
            this.value = value;
            this.suit = suit;
        }

        /*
         * should check if their equal first if not equal than you check the isGreaterThan */

        public boolean isGreaterThan (Cards c) {
            return  c.findIndex() < this.findIndex();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cards cards = (Cards) o;
            return getValue().equals(cards.getValue());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getValue());
        }

        //compare the value of one card to another
        // call find index that will return the value of the valuesystem
        //compare it to another card in the same find index
        //
        public int findIndex(){
            for (int i = 0; i < valuesystem.length; i++){
                if (valuesystem[i].equals(value)){
                    return i;
                }
            }
            return -1;
            //loop over valuesystem
            //compare the item in valuesystem to the value field
            //if they match return the value of i
            // when the for loop ends have a return statement that returns -1
        }

        public String getValue() {
            return value;
        }

        public Type getSuit() {
            return suit;
        }

}
