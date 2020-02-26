import org.junit.Assert;
import org.junit.Test;

public class zad691Test {
    @Test
    public void test(){
        String[] osobniki = {"ABBBAAAEECCCC", "AABBCCEEEEEEEEEBB",
                "CCCA", "BA", "CA", "ABA",
                "CAC", "ABC", "ABA",  "AB"};
        int[] expected = {5, 4};
        Assert.assertArrayEquals(expected, Main.zad691(osobniki));
    }
}
