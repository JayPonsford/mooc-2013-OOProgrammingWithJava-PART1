
public class Printing {

    public static void printStars(int amount) {

        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

        // 39.1
        // you can print one star with the command
        //System.out.print("*");
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;

        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;

        }
        System.out.println("");

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        printStars(5);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}
