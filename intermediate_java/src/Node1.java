
public class Node1 {

    public String data;
    public Node1 next;

    public Node1(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node1 node) {
        this.next = node;
    }

    public static void main(String[] args) {
        Node1 firstNode = new Node1("I am a Node!");
        Node1 secondNode = new Node1("I am the second Node!");
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);
    }
}
