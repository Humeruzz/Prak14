import java.lang.reflect.Executable;
import java.util.HashMap;

public class Map {
    private HashMap<Integer,String> map = new HashMap<>();

    public void mapAdd(Person obj){
        map.put(obj.getName().hashCode(),obj.getName());
    }

    public String mapGet(Person obj){
        return map.get(obj.getName().hashCode());
    }

    public String mapPrint(){
        return map.toString();
    }

    public void mapDelete(Person obj){
        map.remove(obj.hashCode());
    }

    public boolean mapInMap(String name){
        return map.containsKey(name.hashCode());
    }

    public void mapDelete(String name) {
        if (this.mapInMap(name)) {
            map.remove(name.hashCode());
        } else {
            System.out.println("No name");
        }
    }

}
