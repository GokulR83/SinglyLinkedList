import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    void atFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void atEnd(int data) {
        if (head == null) {
            atFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                newNode.next = null;
            }
            current = current.next;
        }
    }

    void inAtBefore(int data, int val) {
        if (head == null) {
            System.out.println("There is No Element");
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        if(current.data==val){
            newNode.next=head;
            head=newNode;
        }
        while (current.next != null) {
            if (current.next.data == val) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

    }

    void inAtAfter(int data, int val) {
        if (head == null) {
            System.out.println("There is No Element");
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.data == val) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    void deleteData(int data) {
        if (head == null) {
            System.out.println("There is No Element");
            return;
        }
        Node current = head;
        if(current.data==data){
            head=current.next;
            return;
        }
        while (current != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    void details() {
        if (head == null) {
            System.out.println("There is No Element");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner In=new Scanner(System.in);
        
        SinglyLinkedList sin = new SinglyLinkedList();
        while(true){
            System.out.println();
            System.out.println("1)Create a Node\n2)Insert At Beginning\n3)Insert At Last\n4)Insert At Element Before\n5)Insert At Element After\n6)Delete An Element\n7)Display All Element In the Node\n8)To Exit\n");
            System.out.print("Enter Your Option: ");
            int n=In.nextInt();
            System.out.println();
                if(n==1){
                    System.out.println("Enter the Element you Want to Create in a Node:");
                    int data=In.nextInt();
                    sin.atFirst(data);
                    System.out.println("Data Inserted");
                    System.out.println();
                    while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element you Want to Create in a Node:");
                            int dat=In.nextInt();
                            sin.atFirst(dat);
                            System.out.println("Data Inserted");
                            System.out.println();
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==2){
                    System.out.println("Enter the Element you Want to Insert At Begin:");
                    int data=In.nextInt();
                    sin.atFirst(data);
                    System.out.println("Data Inserted");
                    System.out.println();
                    while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element you Want to Insert At Begin:");
                            int dat=In.nextInt();
                            sin.atFirst(dat);
                            System.out.println("Data Inserted");
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==3){
                    System.out.println("Enter the Element you Want to Insert At Last:");
                    int data=In.nextInt();
                    sin.atEnd(data);
                    System.out.println("Data Inserted");
                    System.out.println();
                    while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element you Want to Insert At Last:");
                            int dat=In.nextInt();
                            sin.atEnd(dat);
                            System.out.println("Data Inserted");
                            System.out.println();
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==4){
                    System.out.println("Enter the Element data:");
                    int val=In.nextInt();
                    System.out.println("Enter the Element you Want to Insert At Before the Element Data:");
                    int data=In.nextInt();
                    sin.inAtBefore(data, val);
                    System.out.println("Data Inserted");
                    System.out.println();
                    while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element data:");
                            int va=In.nextInt();
                            System.out.println("Enter the Element you Want to Insert At Before the Element Data:");
                            int dat=In.nextInt();
                            sin.inAtBefore(dat, va);
                            System.out.println("Data Inserted");
                            System.out.println();
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==5){
                    System.out.println("Enter the Element data:");
                    int val=In.nextInt();
                    System.out.println("Enter the Element you Want to Insert At After the Element Data:");
                    int data=In.nextInt();
                    sin.inAtAfter(data, val);
                    System.out.println("Data Inserted");
                    System.out.println();
                     while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element data:");
                            int va=In.nextInt();
                            System.out.println("Enter the Element you Want to Insert At After the Element Data:");
                            int dat=In.nextInt();
                            sin.inAtAfter(dat, va);
                            System.out.println("Data Inserted");
                            System.out.println();
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==6){
                    System.out.println("Enter the Element you Want to Delete:");
                    int data=In.nextInt();
                    sin.deleteData(data);
                    System.out.println("Data Deleted");
                    System.out.println();
                    while(true){
                        System.out.println("1)To Continue This Operation\n2)Press Any key To Return Main Menu");
                        System.out.print("Enter Your Option: ");
                        int num=In.nextInt();
                        System.out.println();
                        if(num==1){
                            System.out.println("Enter the Element you Want to Delete in a Node:");
                            int dat=In.nextInt();
                            sin.deleteData(dat);
                            System.out.println("Data Deleted");
                            System.out.println();
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(n==7){
                    sin.details();
                }
                else if(n==8){
                    break;
                }
                else{
                    continue;
                }
        }
    }
}
