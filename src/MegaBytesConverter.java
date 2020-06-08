public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2321);

    }

    public static void printMegaBytesAndKiloBytes (int kiloByte){
        if (kiloByte <0){
            System.out.println("Invalid Value");
        } else {
            int totalMegaBytes = kiloByte / 1024;
            int remainderOfKiloBytes = kiloByte % 1024;
            System.out.println(kiloByte + " KB = " + totalMegaBytes + " MB and " + remainderOfKiloBytes + " KB");
        }
    }
    
}
