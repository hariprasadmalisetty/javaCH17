class Rocket {
    String country;
    double speed;
    double fuelCapacity;
    int noOfThrusters;

    public void print() {
        System.out.println("Country: " + this.country);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Fuel Capacity: " + this.fuelCapacity + " liters");
        System.out.println("Number of Thrusters: " + this.noOfThrusters);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    Rocket(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }
}

class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("USA", 28000, 500000, 4);
        rocket1.print();

        Rocket rocket2 = new Rocket("Russia", 25000, 450000, 5);
        rocket2.print();
    }
}