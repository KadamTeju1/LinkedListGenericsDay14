// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        System.out.println("Wellcome Data Structure Problems using Java Generics Project.");

        LinkedListGenericsDay14<Integer> lgList = new LinkedListGenericsDay14<Integer>();

        lgList.pushValue(70);
        lgList.pushValue(56);

        lgList.displayList();

        lgList.insertValue(30,56);
        lgList.displayList();

        lgList.displayList();
        lgList.searchNum(30);
    }
}