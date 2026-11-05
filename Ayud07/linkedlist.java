class node {
    int data;
    node next;
    public node(int data, node next){
        this.data = data;
        this.next = next;
    }
    public node(int data){
        this.data = data;
        this.next = NULL;
    }
}

public class linkedlist {
    node head;
    public linkedlist(){
        head = NULL;
    }
}
