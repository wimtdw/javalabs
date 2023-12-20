package lab4.num4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5", 3.5, 4);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("NEC Opticlear 2263", 27, "1920x1080");

        Computer computer = new Computer(ComputerBrand.Asus, processor, memory, monitor);

        System.out.println(computer);
    }
}

