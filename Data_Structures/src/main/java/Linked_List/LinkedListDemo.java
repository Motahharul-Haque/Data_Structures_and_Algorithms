package Linked_List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("Charlie");
        list.add("Joe");
        list.add("Job");
        list.add("Bob");
        list.add("Alice");
        System.out.println("Before Delete");
        list.display();
        list.delete();
        System.out.println("\nAfter Delete");
        list.display();
    }
}

