package com.myitcompany.utils;

public class MyLinkedList<T> {
        private Node<T> head;
        private int size;

        public MyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public void add(T data) {
            Node<T> newNode = new Node<>(data);

            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            if (index == 0) {
                head = head.getNext();
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.getNext();
                }
                current.setNext(current.getNext().getNext());
            }
            size--;
        }

        public int size() {
            return size;
        }
}
