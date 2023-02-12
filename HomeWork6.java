// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества
// и метод позволяющий читать элементы по индексу. Формат данных Integer.


import java.util.HashMap;

public class HomeWork6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();

        mySet.add(1);
        mySet.add(22);
        mySet.add(27);
        mySet.add(7);
        System.out.println(mySet);

        for (int index = 0; index < mySet.size(); index++) {
            System.out.println(mySet.get(index));
        }

    }
}

class MySet {
    private HashMap<Integer, Object> map = new HashMap<>();
    private static final Object OBJ = new Object();

    @Override
    public String toString() {
        return map.keySet().toString();
    }
    public boolean add(Integer i) {
        return map.put(i, OBJ) != null ? true : false;
    }

    public Integer size() {
        return map.keySet().size();
    }

    public Integer get(Integer index) {
        return (Integer) map.keySet().toArray()[index];
    }
}

