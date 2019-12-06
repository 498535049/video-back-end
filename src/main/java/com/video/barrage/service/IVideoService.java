package com.video.barrage.service;

import com.video.barrage.entity.Video;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
public interface IVideoService extends IService<Video> {
    Video getVideoById (Long id);

}
