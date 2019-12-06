package com.video.barrage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.video.barrage.entity.Video;
import com.video.barrage.mapper.VideoMapper;
import com.video.barrage.service.IVideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private  VideoMapper videoMapper;

    @Override
    public Video getVideoById(Long id){
       Video  video = null;
        try {
            QueryWrapper<Video> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("id",id);
            video = videoMapper.selectOne(queryWrapper);
        }catch (Exception e){
            logger.error("getVideoListById is false");
        }
        return  video;
    }

}
