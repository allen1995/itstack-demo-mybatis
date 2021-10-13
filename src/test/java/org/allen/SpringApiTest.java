package org.allen;

import com.alibaba.fastjson.JSON;
import org.allen.dao.ISchoolDao;
import org.allen.dao.IUserDao;
import org.allen.po.School;
import org.allen.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config-datasource.xml")
public class SpringApiTest {

    private Logger logger = LoggerFactory.getLogger(SpringApiTest.class);

    @Resource
    private ISchoolDao schoolDao;
    @Resource
    private IUserDao userDao;

    @Test
    public void test_queryRuleTreeByTreeId(){
        School ruleTree = schoolDao.querySchoolInfoById(1L);
        logger.info(JSON.toJSONString(ruleTree));

        User user = userDao.queryUserInfoById(1L);
        logger.info(JSON.toJSONString(user));
    }

}