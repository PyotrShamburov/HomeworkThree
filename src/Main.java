import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        Processor proc = new Processor("AMD Ryzen 3 3200G", 4, 3600);
        RAM operativeMemory = new RAM("DDR4", 8);
        HDD hardMemory = new HDD("Toshiba", 1);
        Computer ourComputer = new Computer(proc, operativeMemory, hardMemory, 2);

        System.out.println("Hello!");
        boolean work = true;
        while (work) {
            System.out.println("Select action: ");
            System.out.println("1.System information.\n" +
                    "2.Switch on computer.\n" +
                    "3.Switch off computer.");
            //System.out.println("cycles count:" + ourComputer.cyclesCounter);
            //System.out.println("burn count:" + ourComputer.burnCounter);
            int input = in.nextInt();
            System.out.println();
            if (ourComputer.burnCounter > 0) {
                System.out.println("Computer is inop, he burnt!");
                work = false;
                break;
            } else if (ourComputer.cyclesCounter >= ourComputer.numOfCycles) {
                System.out.println("Computer used all cycles!");
                work = false;
                break;
            } else {
                if (input > 3 || input < 1) {
                    System.out.println("Wrong choice,please, try again! ");
                    continue;
                } else {
                    switch (input) {
                        case 1:
                            ourComputer.computerInfo();
                            break;
                        case 2:
                            ourComputer.computerStart();
                            break;
                        case 3:
                            ourComputer.computerOff();
                            break;
                    }
                }
            }
        }
    }
}
