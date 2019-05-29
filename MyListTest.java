package season_6.SimpleList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInterger = new MyList<Integer>();
        ListInterger.add(1);
        ListInterger.add(2);
        ListInterger.add(3);
        System.out.println("Element 4: "+ ListInterger.get(2));
        ListInterger.get(-1);
        System.out.println("element -1: " + ListInterger.get(-1));
    }
}
