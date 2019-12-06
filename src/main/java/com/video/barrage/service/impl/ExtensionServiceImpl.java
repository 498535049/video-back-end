package com.video.barrage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.video.barrage.entity.Extension;
import com.video.barrage.exception.RRException;
import com.video.barrage.mapper.ExtensionMapper;
import com.video.barrage.service.IExtensionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ExtensionServiceImpl extends ServiceImpl<ExtensionMapper, Extension> implements IExtensionService {
    @Autowired
    private ExtensionMapper extensionMapper;

    @Override
    public List<Extension> getAdvertList(String type) throws RRException {
        List<Extension>  list = null;
        try {
        if (type.isEmpty()){
            throw new  RRException("type is empty");
        }
        QueryWrapper<Extension> wrapper = new QueryWrapper<>() ;
        wrapper.eq("type",type);
        list = extensionMapper.selectList(wrapper);
        }catch (RRException e){
            e.getCode();
            e.getMsg();
        }
        return  list;
    }
}
