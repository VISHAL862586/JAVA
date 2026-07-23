import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockTest {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("outer method");
            innerMethod();
        }
        finally{
            lock.unlock();
        }
            
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }
        finally{
            lock.unlock();
        }
    }

    public static void main(String args[]){
        LockTest t1 = new LockTest();
        t1.outerMethod();
        
    }
}
