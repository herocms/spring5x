package com.zja.service.Impl;

import com.zja.service.ManyToOneService;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Date: 2019-11-26 14:36
 * Author: zhengja
 * Email: zhengja@dist.com.cn
 * Desc：
 */
@Service
public class ManyToOneServiceImpl implements ManyToOneService {

    @Resource
    private HibernateTemplate hibernateTemplate;


}
