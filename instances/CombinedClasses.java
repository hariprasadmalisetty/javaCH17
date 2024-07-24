public class CombinedClasses {

    static class Rupee {
        String coinSize;
        String coinShape;
        String coinWeight;

        Rupee() {
            System.out.println("Running Rupee");
     
    }

    static class AirCondition {
        String brand;
        String model;
        int capacity;

        AirCondition() {
            System.out.println("Running AirCondition");
        }
    }

    static class Autorikshaw {
        String color;
        int capacity;
        String engineType;

        Autorikshaw() {
            System.out.println("Running Autorikshaw");
        }
    }

    static class AutoDriver {
        String name;
        int experience;
        String licenseNumber;

        AutoDriver() {
            System.out.println("Running AutoDriver");
        }
    }

    static class Rapido {
        String serviceName;
        String city;
        int numberOfDrivers;

        Rapido() {
            System.out.println("Running Rapido");
        }
    }

    static class CabCompany {
        String companyName;
        String headquarters;
        int fleetSize;

        CabCompany() {
            System.out.println("Running CabCompany");
        }
    }

    static class BMTC {
        String routeNumber;
        String busType;
        int numberOfStops;

        BMTC() {
            System.out.println("Running BMTC");
        }
    }

    static class FoodDeliveryCompany {
        String companyName;
        String cuisineType;
        int numberOfRestaurants;

        FoodDeliveryCompany() {
            System.out.println("Running FoodDeliveryCompany");
        }
    }
	
	

    public static void main(String[] args) {
        Rupee rupee = new Rupee();
        System.out.println("Starting Rupee");

        String size = rupee.coinSize;
        String shape = rupee.coinShape;
        String weight = rupee.coinWeight;

        System.out.println("Coin Size: " + size);
        System.out.println("Coin Shape: " + shape);
        System.out.println("Coin Weight: " + weight);

        System.out.println("Ending Rupee");

        AirCondition ac = new AirCondition();
        System.out.println("Starting AirCondition");

        String brand = ac.brand;
        String model = ac.model;
        int capacity = ac.capacity;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);

        System.out.println("Ending AirCondition");

        Autorikshaw auto = new Autorikshaw();
        System.out.println("Starting Autorikshaw");

        String color = auto.color;
        int autoCapacity = auto.capacity;
        String engineType = auto.engineType;

        System.out.println("Color: " + color);
        System.out.println("Capacity: " + autoCapacity);
        System.out.println("Engine Type: " + engineType);

        System.out.println("Ending Autorikshaw");

        AutoDriver driver = new AutoDriver();
        System.out.println("Starting AutoDriver");

        String name = driver.name;
        int experience = driver.experience;
        String licenseNumber = driver.licenseNumber;

        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience);
        System.out.println("License Number: " + licenseNumber);

        System.out.println("Ending AutoDriver");

        Rapido rapido = new Rapido();
        System.out.println("Starting Rapido");

        String serviceName = rapido.serviceName;
        String city = rapido.city;
        int numberOfDrivers = rapido.numberOfDrivers;

        System.out.println("Service Name: " + serviceName);
        System.out.println("City: " + city);
        System.out.println("Number of Drivers: " + numberOfDrivers);

        System.out.println("Ending Rapido");

        CabCompany cabCompany = new CabCompany();
        System.out.println("Starting CabCompany");

        String companyName = cabCompany.companyName;
        String headquarters = cabCompany.headquarters;
        int fleetSize = cabCompany.fleetSize;

        System.out.println("Company Name: " + companyName);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Fleet Size: " + fleetSize);

        System.out.println("Ending CabCompany");

        BMTC bmtc = new BMTC();
        System.out.println("Starting BMTC");

        String routeNumber = bmtc.routeNumber;
        String busType = bmtc.busType;
        int numberOfStops = bmtc.numberOfStops;

        System.out.println("Route Number: " + routeNumber);
        System.out.println("Bus Type: " + busType);
        System.out.println("Number of Stops: " + numberOfStops);

        System.out.println("Ending BMTC");

        FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
        System.out.println("Starting FoodDeliveryCompany");

        String companyNameFd = foodDeliveryCompany.companyName;
        String cuisineType = foodDeliveryCompany.cuisineType;
        int numberOfRestaurants = foodDeliveryCompany.numberOfRestaurants;

        System.out.println("Company Name: " + companyNameFd);
        System.out.println("Cuisine Type: " + cuisineType);
        System.out.println("Number of Restaurants: " + numberOfRestaurants);

        System.out.println("Ending FoodDeliveryCompany");
    }
}
