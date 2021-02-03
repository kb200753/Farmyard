public class farmyard {
    public static void main(String[] args) {
        animal2 myAnimal = new animal2("Mary","Sheep", 5);
        System.out.println(myAnimal.toString());

        Sheep mySheep = new Sheep("01/08/23", "Betsy", 10);
        System.out.println(mySheep);
        System.out.println(mySheep.getType());

    }
}
