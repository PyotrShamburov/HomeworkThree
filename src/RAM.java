public class RAM {
    String information;
    int size;

    public RAM(String information, int size) {
        this.information = information;
        this.size = size;
    }
    public void infoRAM(){
        System.out.println("Type of RAM: "+information+", size: "+size+" GB.");
    }
}
