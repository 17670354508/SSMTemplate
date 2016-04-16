import com.alibaba.fastjson.JSON;
import com.haoyifen.mySSMTemplate.pojo.User;
import com.haoyifen.mySSMTemplate.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by haoyifen on 2016/3/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"})
public class TestUser {
    private Logger logger=Logger.getLogger(TestUser.class);
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user=userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
