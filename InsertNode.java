 // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp = head;
        if(position == 0){
            head = node;
            node.next = head.next;
            return head;
        }else{
            
            if(position == 1){
                head.next = node;
                node.next = temp.next.next;
            }
            
            while(position-- != 1){
                head = head.next;
                
            }
            SinglyLinkedListNode tem = head.next;
            head.next = node;
            node.next = tem;
        
        }
        return temp;
    }
