package ru.tshadrin.utils;

public class NodeList<T> {
    private Node head;

    public Node getHead() {
        return head;
    }

    private void setHead(Node head) {
        this.head = head;
    }

    public class Node {
        private T value;
        private Node next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * Добавить эелемент в начало
     * @param value - добавляемый элемент
     */

    public void addFirst(T value) {
        Node node = new Node();
        node.setValue(value);
        if (this.getHead() != null) {
            node.setNext(head);
        }
        this.setHead(node);
    }

    /**
     * Удалить первый элемент связанного списка
     */
    public void removeFirst(){
        if (this.getHead() != null){
            this.setHead(this.getHead().getNext());
        }
    }

    public void revert() {
        if (this.getHead() != null && this.getHead().getNext() != null) {
            Node temp  = this.getHead();
            revert(this.getHead().getNext(), this.getHead());
            temp.setNext(null);
        }
    }

    private void revert (Node currentNode, Node previousNode) {
        if (currentNode.getNext() == null) {
            this.setHead(currentNode);
        } else {
            revert(currentNode.getNext(), currentNode);
        }
        currentNode.setNext(previousNode);
    }

}
