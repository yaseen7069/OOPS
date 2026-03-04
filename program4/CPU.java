import java.util.Scanner;

public class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    public class Processor {
        double cores;
        String manufacturer;

        double getCache(double f) {
            return f;
        }
    }

    static class RAM {
        double memory;
        String manufacturer;

        double getClockSpeed(double r) {
            return r;
        }
    }
}

class CPUDetails {
    public static void main(String args[]) {

        double p,m;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the cache of the processor:");
        p = s.nextDouble();
        System.out.println("Enter the clock speed:");
        m = s.nextDouble();

        CPU cpu = new CPU(0);
        CPU.Processor pro = cpu.new Processor();
        
        CPU.RAM ram = new CPU.RAM();
        double cacheValue = pro.getCache(p);
        double clockValue = ram.getClockSpeed(m);
        
        cpu.price = (cacheValue * 1000) + (clockValue * 10);
        System.out.println("Processor Cache = " + cacheValue);
        System.out.println("RAM Clock Speed = " + clockValue);
        System.out.println("CPU Price = " + cpu.price);
    }
}
