package linkedList;

public class App {
    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.add(1);
//        list.add(12);
//        list.add(14);
//        list.add(19);
//        list.add(12);
//        list.add(21);
//        list.add(24);
//        list.add(28);

        list.print();

        list.deleteDups();
        list.print();



    }

}
