package com.zking.ssm.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zking.ssm.model.News;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class INewsServiceTest extends BaseTestCase {
    @Autowired
    private  INewsService newsService;
    private News news;
    @Before
    public void setUp()  {
        news=new News();
    }

    @Test
    public void del() throws Exception {
        news.setNewsId(1);
        newsService.del(news);
    }

    @Test
    public void grantCatrgoriey() throws Exception {
        news.setNewsId(1);
        news.setCategoryId(3);
        newsService.grantCatrgoriey(news);
    }

    @Test
    public void removeCatrgoriey() throws Exception {
    }

}