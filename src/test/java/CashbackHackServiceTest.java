import org.junit.Test;
import org.junit.Assert;

import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void buyExuctly() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public  void buyUp(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public  void buyDown(){
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(expected,actual);
}
}
