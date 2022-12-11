package car;

public class Car {
    int cadence, speed, gear;

    public void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int speed) {
        this.speed = speed;
    }
    public void printInfo(){
        System.out.println(
                "cadence : "+ cadence+ "\n"+
                        "speed : "+ speed+ "\n"+
                        "gear : "+ gear
        );    }
}
