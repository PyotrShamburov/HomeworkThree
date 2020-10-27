import java.util.Random;
import java.util.Scanner;

public class Computer {
    Processor processor;
    RAM operativeMemory;
    HDD hardDrive;
    int numOfCycles;
    int cyclesCounter = 0;
    int burnCounter = 0;

    public Computer(Processor processor, RAM operativeMemory, HDD hardDrive, int numOfCycles) {
        this.processor = processor;
        this.operativeMemory = operativeMemory;
        this.hardDrive = hardDrive;
        this.numOfCycles = numOfCycles;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setOperativeMemory(RAM operativeMemory) {
        this.operativeMemory = operativeMemory;
    }

    public void setHardDrive(HDD hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void computerInfo() {
        System.out.println("System configuration: ");
        processor.procInfo();
        operativeMemory.infoRAM();
        hardDrive.infoHDD();
        System.out.println("Cycles of computer: " + numOfCycles);
    }

    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    public int computerStart() {
        boolean start = true;
        while (start) {
            System.out.println("Computer is starting!");
            int randomNumber = rand.nextInt(2);
            System.out.println("Enter 0 or 1!");
            int enterNumber = in.nextInt();
            if (enterNumber > 1 || enterNumber < 0) {
                System.out.println("Wrong number! Try again.");
                continue;
            } else if (randomNumber != enterNumber) {
                System.out.println("Computer was burn down!");
                ++burnCounter;
            } else {
                System.out.println("Congratulations!Computer works! ");
                ++cyclesCounter;
            }
            start = false;
        }
        return cyclesCounter+burnCounter;
    }

    public int computerOff() {
        boolean finish = true;
        while (finish) {
            System.out.println("Computer is turning off!");
            int randomNumber = rand.nextInt(2);
            System.out.println("Enter 0 or 1!");
            int enterNumber = in.nextInt();
            if (enterNumber > 1 || enterNumber < 0) {
                System.out.println("Wrong number! Try again.");
                continue;
            } else if (randomNumber != enterNumber) {
                System.out.println("Computer was burn down!");
                ++burnCounter;
            } else {
                System.out.println("Congratulations!Computer was turn off! ");
                ++cyclesCounter;
            }
            finish = false;
        }
        return cyclesCounter+burnCounter;
    }
}






