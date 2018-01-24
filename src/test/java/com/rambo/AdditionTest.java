import com.rambo.Addition;
import org.junit.Test;

public class AdditionTest{
    @Test
    public void testAdd(){
        int a=10;
        int b=5;

        Addition add = new Addition();
        int c = add.add(a,b);
        System.out.println(c);
    }
}