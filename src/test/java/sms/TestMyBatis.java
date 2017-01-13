package sms;
 
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yyl.sms.pojo.User;
import com.yyl.sms.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestMyBatis { 
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService;
	
	@Test
	public void test1(){
		User user = userService.getUserById(1);
		logger.info(JSON.toJSON(user));
		
	}
}
