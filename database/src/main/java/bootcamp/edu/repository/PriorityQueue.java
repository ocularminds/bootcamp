PriorityQueue q = new PriorityQueue();
q.add("Festus");
q.add("Jamie");
q.peak(); // get what is on top without deleting
q.poll(); // get what is on top and delete

Stack s = new Stack();
s.add("Festus");
s.add("Jimie");
s.pop();// get and delete top item
s.isEmpty();//check if there is still records
Iterator it = s.iterator();
while(it.hasNext()){
    Object o = it.next();
}

// Tree impplementation
// has node with left-right leaves
class Node{
    Node left;
    Node right;
    Node(int item){
        this.key = item;
        this.left = right = null;
    }
}
public void binarySearch(int arr[], int searched){
    int low = 0, high = arr.length - 1;
    // This below check covers all cases , so need to check
    // for mid=lo-(high-low)/2
    while ((high - low) > 1) {
        int mid = (high + low) / 2;
        if (arr[mid] < searched) {
            low = mid + 1;
        } else {
            high = mid;
        }
        
    } 
    if (arr[low] == searched) {
        System.out.println("Found At Index " + low );
      } else if arr[high] == searched) {
          System.out.println("Found At Index " + hi );
      } else {
          System.out.println("Not Found" );
      }
}