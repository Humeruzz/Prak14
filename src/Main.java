public class Main {

    public static void main(String[] args) {
        Person obj1 = new Person("John", "Male");
        Person obj2 = new Person("John1", "Male");
        Person obj3 = new Person("John2", "Male");
        Person obj4 = new Person("John3", "Male");
        Person obj5 = new Person("John4", "Male");
        Map map = new Map();
        map.mapAdd(obj1);
        map.mapAdd(obj2);
        map.mapAdd(obj3);
        map.mapAdd(obj4);
        map.mapAdd(obj5);
        System.out.println(map.mapGet(obj1));
        System.out.println(obj1.getName().hashCode());
        map.mapDelete("John6");
        System.out.println(map.mapPrint());
    }
}
