package alexpolkin.ru;

import java.util.LinkedList;
import java.util.List;

public class ObjectPool {
    List<PoolledObject> free = new LinkedList<>();
    List<PoolledObject> used = new LinkedList<>();

    public PoolledObject getPooledObject() {
        if (free.isEmpty()) {
            PoolledObject poolledObject = new PoolledObject();
            used.add(poolledObject);
            return poolledObject;
        } else {
            PoolledObject poolledObject = free.get(0);
            used.add(poolledObject);
            free.remove(poolledObject);
            return poolledObject;
        }
    }

    public void releasePooledObject(PoolledObject poolledObject){
        used.remove(poolledObject);
        free.add(poolledObject);
    }
}
