class Account {
    
}
class Car extends Account {
        int numberOfSeats;

        public Car(int numberOfSeats){
            this.numberOfSeats = 5;
        }

        public Car(int numberOfSeats, int id, int brand, int year){
            this.numberOfSeats = getNumberOfSeats();
        }
        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public void startEngine(){
            System.out.println("Car engine starts...");
        }

    }

class Motorcycle extends Account{

}
