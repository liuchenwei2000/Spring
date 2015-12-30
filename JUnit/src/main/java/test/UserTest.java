package test;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年11月21日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:testspring*-context.xml" })
public class UserTest
{
    @Resource
    private User user;
    
    @Test
    public void testUser(){
        User user = new User();
        user.setCode("code0001");
        user.setName("name0001");
        
        Assert.assertNotNull(user.getCode());
        Assert.assertNotNull(user.getName());
    }
}
