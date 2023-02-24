package Patterns.Structural.Proxy;

//          Структурный паттерн проектирования, который позволяет подставлять вместо реальных
//        объектов специальные объекты-заменители,которые перехватывают вызовы к оригинальному
//        объекту, позволяя сделать что-то до или после передачи вызова оригиналу.
//
//        Цель:
//      Замещение другого объекта и контроля доступа к нему
//


public class ProxyTest {
    public static void main(String[] args) {

        Driven car1 = new ProxyCar(" Volvo");
        car1.drive();

        System.out.println("---------------------------");

        Driven car2 = new Car(" Audi");
        car2.drive();
    }
}
