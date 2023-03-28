package com.yuanlrc.base;

import static org.junit.Assert.assertTrue;


import com.yuanlrc.base.dao.admin.RepairsDao;
import com.yuanlrc.base.entity.admin.EmpType;
import com.yuanlrc.base.entity.admin.Repairs;
import com.yuanlrc.base.service.admin.RepairsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{

    @Autowired
    private RepairsDao repairsDao;

    /**
     * Rigorous Test :-)
     */

    @Test
    public  void  test1(){

        List<Repairs> repairs = repairsDao.findByDormitoryIdAndEmpTypeAndStatus(2L, EmpType.plumber, 0);
        System.out.println();
    }
}
