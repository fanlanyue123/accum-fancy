package com.fancy.simple.website.dao;

import com.fancy.simple.website.dao.test.entity.SimpleWebsite;
import com.fancy.simple.website.dao.test.mapper.SimpleWebsiteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.Date;

import static junit.framework.TestCase.*;

/**
 * SimpleWebsite 数据库（mybatis）测试
 *
 * @author fanlanyue
 * @Date 2016/2/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration
@ContextConfiguration(locations = {"classpath*:spring/application-context.xml"})
public class SimpleWebsiteTest {

    @Autowired
    private SimpleWebsiteMapper simpleWebsiteMapper;

    @Test
    public void test_add() {
        SimpleWebsite simpleWebsite = new SimpleWebsite();
        simpleWebsite.setName("lucy3");
        simpleWebsite.setAge(13);
        simpleWebsite.setCreateTime(new Date());
        simpleWebsite.setSex((byte) 1);
        simpleWebsite.setUpdateTime(simpleWebsite.getCreateTime());
        Integer isOK = simpleWebsiteMapper.insertSelective(simpleWebsite);

        assertNotNull(isOK);
        assertTrue(isOK > 0);
        assertFalse(isOK <= 0);

        System.out.println(isOK);

    }
}
