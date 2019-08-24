package com.zking.ssm.service;

import com.zking.ssm.model.News;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {
    int del(News record);
    int grantCatrgoriey(News record);
    int removeCatrgoriey(News record);
}
