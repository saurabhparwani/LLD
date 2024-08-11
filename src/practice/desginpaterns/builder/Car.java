package practice.desginpaterns.builder;

public class Car {
    private String engine;
    private String[] tyres;
    private String[] doors;
    private String[] fuelTank;
    private String[] airbags;
    private String[] speakers;
    private String sunroof;

    public static CarBuilder getBuilder(){
        return new CarBuilder();
    }
    public static class CarBuilder {
        private String engine;
        private String[] tyres;
        private String[] doors;
        private String[] fuelTank;
        private String[] airbags;
        private String[] speakers;
        private String sunroof;

        public CarBuilder withEngine(final String engine){
            this.engine = engine;
            return this;
        }
        public CarBuilder withTyres(String[] tyres){
            this.tyres = tyres;
            return this;
        }
        public CarBuilder withDoors(String[] doors){
            this.doors = doors;
            return this;
        }
        public CarBuilder withairBags(String[] airbags){
            this.airbags = airbags;
            return this;
        }
        public CarBuilder withFuelTank(String[] fuelTank){
            this.fuelTank = fuelTank;
            return this;
        }
        public CarBuilder withspeakers(String[] speaker){
            this.speakers = speaker;
            return this;
        }
        public CarBuilder withsunroof(String sunroof){
            this.sunroof = sunroof;
            return this;
        }

        public Car build(){
            if(this.engine == null || this.tyres == null || this.doors == null || this.fuelTank == null){
                System.out.println("Mandatory parameters are missing");
                return null;
            }
            Car car = new Car();
            car.engine = this.engine;
            car.tyres = this.tyres;
            car.doors = this.doors;
            car.fuelTank = this.fuelTank;
            car.sunroof = this.sunroof;
            car.airbags = this.airbags;
            car.speakers =this.speakers;
            System.out.println("Car builded successfully");
            return car;
        }
    }
}
