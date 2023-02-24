package Patterns.Creational.FactoryMethod;

//Порождающий шаблон проектирования, в котором
// подклассы имплементируют общий интерфейс с методом для создания объектов.
// Переопределенный метод в каждом наследнике возвращает
// нужный вариант объекта.

public class Program {
//    1) создаем интерфейс для классов(объектов)
//    2) создаем интерфейс Factory (возвращает (1)- интерфейс для классов(объектов))
//    3) создаем class impl (1)
//    4) создаем class impl (2)

    public static void main(String[] args) {

//        Developer javaDev = new JavaDeveloper();
//        javaDev.writeCode();
//        Developer cppDev = new CppDerveloper();
//        cppDev.writeCode();
//        System.out.println("-----------------------");


        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer dev = developerFactory.createDeveloper();
        dev.writeCode();
        System.out.println("-----------------------");

        developerFactory = creator("C++");
        dev = developerFactory.createDeveloper();
        dev.writeCode();
        System.out.println("-----------------------");

        developerFactory = creator("php");
        dev = developerFactory.createDeveloper();
        dev.writeCode();

    }

    static DeveloperFactory creator(String languageDev) {
        if (languageDev.equals("Java")) {
            return new JavaDeveloperFactory();
        } else if (languageDev.equals("C++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("no language");
        }
    }
}
