public class HDD {
    String brand;
    int size;

    public HDD(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    public void infoHDD(){
        System.out.println("HDD: "+brand+", size: "+size+" TB.");
    }
}
