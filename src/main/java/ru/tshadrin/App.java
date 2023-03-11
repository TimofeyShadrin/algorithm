package ru.tshadrin;

import ru.tshadrin.domain.Employee;
import ru.tshadrin.service.Service;
import ru.tshadrin.utils.NodeList;

public class App
{
    private static final Service<Employee> SERVICE = new Service<>();
    public static void main( String[] args )
    {
        NodeList<Employee> list = new NodeList<>();
        list.addFirst(new Employee("Ivan", 25));
        list.addFirst(new Employee("Alex", 27));
        list.addFirst(new Employee("Tom", 33));

        SERVICE.printList(list);
        list.revert();
        SERVICE.printList(list);
    }
}
