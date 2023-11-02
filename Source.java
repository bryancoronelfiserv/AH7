class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    int sum = 0;
    Node<Integer> cur = head;

    while (cur != null) {
      sum += cur.val;
      cur = cur.next;
    }
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));

    // my test case
    // Create a new linked list for your test case
    Node<Integer> x = new Node<>(10);
    Node<Integer> y = new Node<>(5);
    Node<Integer> z = new Node<>(-3);
    Node<Integer> w = new Node<>(20);

    x.next = y;
    y.next = z;
    z.next = w;

    // Calculate the sum of the new linked list
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(x)); // Output: 32
  }
}
