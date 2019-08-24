package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.NewsMapper;
import com.zking.ssm.model.News;
import com.zking.ssm.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public int del(News record) {
        newsMapper.deleteNewsCategoryByNewsId(record.getNewsId());
        int i = newsMapper.deleteByPrimaryKey(record.getNewsId());
        return i;
    }

    @Override
    public int grantCatrgoriey(News record) {
        return newsMapper.grantCatrgoriey(record);
    }

    @Override
    public int removeCatrgoriey(News record) {
        return newsMapper.removeCatrgoriey(record);
    }
}
