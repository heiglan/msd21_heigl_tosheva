package at.fhj.msd;

public interface Drink {

        /**
         * Creates a Drink object with given name
         */
        public abstract void Drink(String name);
        /**
         * Calculates and returns volume of drink
         */
        public abstract double getVolume();
        /**
         * Calculates and returns the alcohol percentage
         */
        public abstract double getAlcoholPercent();
        /**
         * Gives information if drink is alcoholic or not
         */
        public abstract boolean isAlcoholic();

        public String getName() ;

        public void setName(String name);
}
