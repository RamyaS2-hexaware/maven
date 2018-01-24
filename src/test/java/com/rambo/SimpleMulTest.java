import com.rambo.SimpleMul;
import org.junit.Test;

public class SimpleMulTest{
    @Test
    public void testMul(){
        int a=10;
        int b=5;

        SimpleMul eg = new SimpleMul();
        int c = eg.mul(a,b);
        System.out.println(c);
    }
}

