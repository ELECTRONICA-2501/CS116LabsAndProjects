package CS116Lab5;

public class ComputerClient {

    ComputerPart Ram = new ComputerPart("Ram", 100);
    ComputerPart CPU = new ComputerPart("CPU", 200);
    ComputerPart GPU = new ComputerPart("GPU", 300);
    ComputerPart Motherboard = new ComputerPart("Motherboard", 400);
    ComputerPart PowerSupply = new ComputerPart("PowerSupply", 500);
    ComputerPart Case = new ComputerPart("Case", 600);
    ComputerPart HardDrive = new ComputerPart("HardDrive", 700);
    ComputerPart SSD = new ComputerPart("SSD", 800);
    ComputerPart Monitor = new ComputerPart("Monitor", 900);
    ComputerPart Keyboard = new ComputerPart("Keyboard", 1000);

    ComputerKit kit1 = new ComputerKit();
    kit1.addComputerPart(Ram);
    kit1.addComputerPart(CPU);
    kit1.addComputerPart(GPU);

    System.out.Println("Price: " + kit1.expensive());

    String itemToCheck = "Ram";
    if (kit1.contains(itemToCheck)){
        System.out.println("The kit contains " + itemToCheck);
    }
    else{
        System.out.println("The kit does not contain " + itemToCheck);
    }

    System.out.Printlin()




}
