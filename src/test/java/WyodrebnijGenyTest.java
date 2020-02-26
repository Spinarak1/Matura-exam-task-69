import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WyodrebnijGenyTest {
    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList("AAEEEECCCEEBB"), Main.wyodrebnijGeny("AAEEEECCCEEBB"));
        Assert.assertEquals(Arrays.asList("AAEEEECCCEEBB"), Main.wyodrebnijGeny("CCCCAAEEEECCCEEBBCCC"));
        Assert.assertEquals(Arrays.asList(), Main.wyodrebnijGeny("AAAAAAAAAAAAAAAAAB"));
        Assert.assertEquals(Arrays.asList("AABB"), Main.wyodrebnijGeny("AABB"));
        Assert.assertEquals(Arrays.asList("AACCCCCBB", "AAEEEBB"), Main.wyodrebnijGeny("AACCCCCBBAAEEEBB"));
       //Assert.assertEquals("", Main.wyodrebnijGeny(""));*/
    }
}
