package alexpolkin.ru;

public class Main {

    public static void main(String argv[]) {
        ObjectPool pool = new ObjectPool();
        PoolledObject poolledObject = pool.getPooledObject();
        pool.releasePooledObject(poolledObject);
    }
}
