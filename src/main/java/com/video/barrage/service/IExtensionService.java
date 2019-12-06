package com.video.barrage.service;

import com.video.barrage.entity.Extension;
import com.baomidou.mybatisplus.extension.service.IService;
import com.video.barrage.exception.RRException;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
public interface IExtensionService extends IService<Extension> {
    List<Extension>  getAdvertList (String type)throws RRException;
}
