class Account {
    
}
class Car extends Account {
        int numberOfSeats;

        public Car(int numberOfSeats){
            this.numberOfSeats = 5;
        }

        public Car(int numberOfSeats, String id, String brand, int year){
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
    boolean hasSidecar;

    public Motorcycle(boolean hasSidecar){
        this.hasSidecar = false;
    }

    public Motorcycle(boolean hasSidecar, String id , String brand, int year){
        this.hasSidecar = isHasSidecar();
    }

    public void startEngine(){
        System.out.println("Motorcycle engone starts...");
    }



    public boolean isHasSidecar() {
        return hasSidecar;
    }



    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
