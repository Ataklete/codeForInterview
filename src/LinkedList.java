public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = new Node();
    }

    public Node add(String n){
        Node newNode = new Node();
        newNode.data = n;

        if (head==null){
            head.next = newNode;
        }else{

            newNode.next = head.next;
            head.next = newNode;
        }

        return newNode;
    }

        public void insertOrder(String item) {
            Node n = new Node();
            n.data = item;
            Node temp = head;

            if (temp.next != null) {

                if (item.compareTo(temp.next.data)<1) {
                    n.next = temp.next;
//                    temp.next.prev = n;
//                    n.prev = temp;
                    temp.next = n;
                } else {
                    temp = temp.next;
                    n.next = temp.next;
//                    n.prev = temp;
                    temp.next = n;
//                    if (n.next!=null)
//                        temp.next.prev = n;
                }
            } else {
                head.next = n;
                n.next = null;
//                n.prev = head;
            }
        }

    public String toString() {
            Node temp = head.next;
            String str= "";
            while (temp != null){
                str = str + temp.data + "->";
                  temp = temp.next;
            }

            return str;
        }
  public   class Node {
        String data;
        Node next;

//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }


    }
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add("Ati");
//        linkedList.add("Joseph");
//        linkedList.add("Henok");
//        linkedList.add("Helen");
//        linkedList.add("Saba");
        System.out.println(linkedList);
        System.out.println();
        linkedList.insertOrder("Ati");
        linkedList.insertOrder("Joseph");
        linkedList.insertOrder("Henok");
        linkedList.insertOrder("Helen");
        linkedList.insertOrder("Saba");
        System.out.println(linkedList);

    }
}
