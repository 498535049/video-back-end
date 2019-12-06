package com.video.barrage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.video.barrage.entity.Homepage;
import com.video.barrage.mapper.HomepageMapper;
import com.video.barrage.service.IHomepageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
@Service
public class HomepageServiceImpl extends ServiceImpl<HomepageMapper, Homepage> implements IHomepageService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HomepageMapper homepageMapper;
    @Override
     public List<Homepage> queryWheelPlantingListBytype(String type){
        List<Homepage> list = null;
        try {
            QueryWrapper<Homepage> wrapper = new QueryWrapper<>();
            wrapper.eq("type", type);
            list =  homepageMapper.selectList(wrapper);
        }catch (Exception e){
            logger.warn("queryWheelPlantingListBytype is false");
        }
        return list;
    }
}
