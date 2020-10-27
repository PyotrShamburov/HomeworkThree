public class Processor {
    String brand;
    int numOfCores;
    int frequency;

    public Processor(String brand, int numOfCores, int frequency) {
        this.brand = brand;
        this.numOfCores = numOfCores;
        this.frequency = frequency;
    }

    public void procInfo() {
        System.out.println("Processor: " + brand + ", number of cores: " + numOfCores + ", frequency: " + frequency + " GHz.");
    }
}

