package ru.tshadrin.service;

import ru.tshadrin.domain.Employee;
import ru.tshadrin.utils.NodeList;

public class Service<T extends Employee> {
    public void printList(NodeList<T> list) {
        NodeList<T>.Node node = list.getHead();
        while (node != null) {
            System.out.printf("%s - %d\n", node.getValue().getName(), node.getValue().getAge());
            node = node.getNext();
        }
    }
}
