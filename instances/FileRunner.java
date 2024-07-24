 class RunnerFile {

    class Matrimony {
        String name;
        int age;
        String state;

        Matrimony() {
            System.out.println("Running Matrimony");
        }
    }

    class Application {
        String name1;
        int mb;
        String purpose;

        Application() {
            System.out.println("Running Application");
        }
    }

    class Fruit {
        String fruitName;
        int quantity;
        double price;

        Fruit() {
            System.out.println("Running Fruit");
        }
    }

    class Juice {
        String juiceName;
        int ml;
        double cost;

        Juice() {
            System.out.println("Running Juice");
        }
    }

    class Place {
        String placeName;
        int distance;
        String mode;

        Place() {
            System.out.println("Running Place");
        }
    }

    class AlcoholBrand {
        String brandName;
        String rating;

        AlcoholBrand() {
            System.out.println("Running AlcoholBrand");
        }
    }

    class Candy {
        String candyName;
        String flavour;
        String brand;

        Candy() {
            System.out.println("Running Candy");
        }
    }

    class Medicine {
        String tablet;
        String company;
        int qty;

        Medicine() {
            System.out.println("Running Medicine");
        }
    }

    class Food {
        String foodName;
        String type;
        int ratings;

        Food() {
            System.out.println("Running Food");
        }
    }

    public static void main(String[] args) {
        RunnerFile runner = new RunnerFile();
        System.out.println("Starting in main");

        Matrimony matrimony = runner.new Matrimony();
        matrimony.name = "Leonardo DiCaprio";
        matrimony.age = 46;
        matrimony.state = "California";
        System.out.println("Name: " + matrimony.name);
        System.out.println("Age: " + matrimony.age);
        System.out.println("State: " + matrimony.state);
        System.out.println("--------------");

        matrimony.name = "Angelina Jolie";
        matrimony.age = 45;
        matrimony.state = "California";
        System.out.println("Name: " + matrimony.name);
        System.out.println("Age: " + matrimony.age);
        System.out.println("State: " + matrimony.state);
        System.out.println("--------------");

        matrimony.name = "Brad Pitt";
        matrimony.age = 57;
        matrimony.state = "Oklahoma";
        System.out.println("Name: " + matrimony.name);
        System.out.println("Age: " + matrimony.age);
        System.out.println("State: " + matrimony.state);
        System.out.println("--------------");

        Application app = runner.new Application();
        app.name1 = "Instagram";
        app.mb = 150;
        app.purpose = "social networking";
        System.out.println("Name: " + app.name1);
        System.out.println("MB: " + app.mb);
        System.out.println("Purpose: " + app.purpose);
        System.out.println("--------------");

        app.name1 = "Twitter";
        app.mb = 80;
        app.purpose = "microblogging";
        System.out.println("Name: " + app.name1);
        System.out.println("MB: " + app.mb);
        System.out.println("Purpose: " + app.purpose);
        System.out.println("--------------");

        app.name1 = "Spotify";
        app.mb = 200;
        app.purpose = "music streaming";
        System.out.println("Name: " + app.name1);
        System.out.println("MB: " + app.mb);
        System.out.println("Purpose: " + app.purpose);
        System.out.println("--------------");

        Fruit fruit = runner.new Fruit();
        fruit.fruitName = "Apple";
        fruit.quantity = 2;
        fruit.price = 80;
        System.out.println("Name: " + fruit.fruitName);
        System.out.println("Quantity: " + fruit.quantity);
        System.out.println("Price: " + fruit.price);
        System.out.println("--------------");

        fruit.fruitName = "Banana";
        fruit.quantity = 6;
        fruit.price = 30;
        System.out.println("Name: " + fruit.fruitName);
        System.out.println("Quantity: " + fruit.quantity);
        System.out.println("Price: " + fruit.price);
        System.out.println("--------------");

        fruit.fruitName = "Orange";
        fruit.quantity = 4;
        fruit.price = 60;
        System.out.println("Name: " + fruit.fruitName);
        System.out.println("Quantity: " + fruit.quantity);
        System.out.println("Price: " + fruit.price);
        System.out.println("--------------");

        Juice juice = runner.new Juice();
        juice.juiceName = "Banana Juice";
        juice.ml = 250;
        juice.cost = 50;
        System.out.println("Juice Name: " + juice.juiceName);
        System.out.println("ML: " + juice.ml);
        System.out.println("Cost: " + juice.cost);
        System.out.println("--------------");

        juice.juiceName = "Orange Juice";
        juice.ml = 300;
        juice.cost = 70;
        System.out.println("Juice Name: " + juice.juiceName);
        System.out.println("ML: " + juice.ml);
        System.out.println("Cost: " + juice.cost);
        System.out.println("--------------");

        juice.juiceName = "Apple Juice";
        juice.ml = 200;
        juice.cost = 60;
        System.out.println("Juice Name: " + juice.juiceName);
        System.out.println("ML: " + juice.ml);
        System.out.println("Cost: " + juice.cost);
        System.out.println("--------------");

        Place place = runner.new Place();
        place.placeName = "Hollywood";
        place.distance = 10;
        place.mode = "Car";
        System.out.println("Place Name: " + place.placeName);
        System.out.println("Distance: " + place.distance);
        System.out.println("Mode: " + place.mode);
        System.out.println("--------------");

        place.placeName = "Beverly Hills";
        place.distance = 5;
        place.mode = "Bicycle";
        System.out.println("Place Name: " + place.placeName);
        System.out.println("Distance: " + place.distance);
        System.out.println("Mode: " + place.mode);
        System.out.println("--------------");

        place.placeName = "Santa Monica";
        place.distance = 15;
        place.mode = "Bus";
        System.out.println("Place Name: " + place.placeName);
        System.out.println("Distance: " + place.distance);
        System.out.println("Mode: " + place.mode);
        System.out.println("--------------");

        AlcoholBrand alcohol = runner.new AlcoholBrand();
        alcohol.brandName = "Jack Daniels";
        alcohol.rating = "excellent";
        System.out.println("Alcohol Brand: " + alcohol.brandName);
        System.out.println("Rating: " + alcohol.rating);
        System.out.println("--------------");

        alcohol.brandName = "Johnny Walker";
        alcohol.rating = "good";
        System.out.println("Alcohol Brand: " + alcohol.brandName);
        System.out.println("Rating: " + alcohol.rating);
        System.out.println("--------------");

        alcohol.brandName = "Grey Goose";
        alcohol.rating = "excellent";
        System.out.println("Alcohol Brand: " + alcohol.brandName);
        System.out.println("Rating: " + alcohol.rating);
        System.out.println("--------------");

        Candy candy = runner.new Candy();
        candy.candyName = "M&M's";
        candy.flavour = "Chocolate";
        candy.brand = "Mars";
        System.out.println("Name: " + candy.candyName);
        System.out.println("Flavour: " + candy.flavour);
        System.out.println("Brand: " + candy.brand);
        System.out.println("--------------");

        candy.candyName = "Skittles";
        candy.flavour = "Fruity";
        candy.brand = "Wrigley";
        System.out.println("Name: " + candy.candyName);
        System.out.println("Flavour: " + candy.flavour);
        System.out.println("Brand: " + candy.brand);
        System.out.println("--------------");

        candy.candyName = "Reese's";
        candy.flavour = "Peanut Butter";
        candy.brand = "Hershey's";
        System.out.println("Name: " + candy.candyName);
        System.out.println("Flavour: " + candy.flavour);
        System.out.println("Brand: " + candy.brand);
        System.out.println("--------------");

        Medicine medicine = runner.new Medicine();
        medicine.tablet = "Ibuprofen";
        medicine.company = "Pfizer";
        medicine.qty = 20;
        System.out.println("Tablet: " + medicine.tablet);
        System.out.println("Company: " + medicine.company);
        System.out.println("Qty: " + medicine.qty);
        System.out.println("--------------");

        medicine.tablet = "Paracetamol";
        medicine.company = "Johnson & Johnson";
        medicine.qty = 15;
        System.out.println("Tablet: " + medicine.tablet);
        System.out.println("Company: " + medicine.company);
        System.out.println("Qty: " + medicine.qty);
        System.out.println("--------------");

        medicine.tablet = "Aspirin";
        medicine.company = "Bayer";
        medicine.qty = 10;
        System.out.println("Tablet: " + medicine.tablet);
        System.out.println("Company: " + medicine.company);
        System.out.println("Qty: " + medicine.qty);
        System.out.println("--------------");

        Food food = runner.new Food();
        food.foodName = "Pizza";
        food.type = "Italian";
        food.ratings = 5;
        System.out.println("Food Name: " + food.foodName);
        System.out.println("Type: " + food.type);
        System.out.println("Rating: " + food.ratings);
        System.out.println("--------------");

        food.foodName = "Sushi";
        food.type = "Japanese";
        food.ratings = 4;
        System.out.println("Food Name: " + food.foodName);
        System.out.println("Type: " + food.type);
        System.out.println("Rating: " + food.ratings);
        System.out.println("--------------");

        food.foodName = "Burger";
        food.type = "American";
        food.ratings = 5;
        System.out.println("Food Name: " + food.foodName);
        System.out.println("Type: " + food.type);
        System.out.println("Rating: " + food.ratings);
        System.out.println("--------------");
    }
}
