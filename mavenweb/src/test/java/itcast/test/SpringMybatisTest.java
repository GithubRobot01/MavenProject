package itcast.test;

import itcast.pojo.Item;
import itcast.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml","classpath:applicationContext-dao.xml"})
public class SpringMybatisTest {
    @Autowired
    private ItemService itemService;

    @Test
    public void test1(){
        Item item = itemService.findById(1);
        System.out.println(item);
    }
}
