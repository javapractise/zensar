package com.demo.mavenproject;


import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
 
public class ToDoServiceImplTest {
 
    
    ToDoServiceImpl service;

    @Before
    public void SetUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

    }


    @Test
    public void test1(){


        service.retrieveData("1");
    }


}
