package CS116Lab5;
public class ComputerClient {
    public static void main(String[] args) {

        ComputerPart Monitor = new ComputerPart("Monitor", 100);
        ComputerPart Cache = new ComputerPart("Cache", 500);
        ComputerPart CPU = new ComputerPart("CPU", 1000);
        ComputerPart Ram = new ComputerPart("Ram", 1100);

        ComputerKit kit1 = new ComputerKit();

       kit1.addComputerPart(Ram);

       kit1.addComputerPart(CPU);
       kit1.addComputerPart(Cache);
       kit1.addComputerPart(Monitor);
         kit1.addComputerPart(Ram);

       kit1.addComputerPart(Monitor);
       kit1.addComputerPart(Ram);

         System.out.println(kit1.expensive());
         System.out.println(kit1.contains("Monitor" ));
         System.out.println(kit1.countItem("Monitor"));
        System.out.println(kit1.countItem("CPU"));
        System.out.println(kit1.countItem("Cache"));
        System.out.println(kit1.countItem("Ram"));

    }
}
