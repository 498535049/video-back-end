package com.video.barrage.controller;


import com.video.barrage.entity.Extension;
import com.video.barrage.exception.RRException;
import com.video.barrage.service.IExtensionService;
import com.video.barrage.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
@RestController
@RequestMapping("/extension")
public class ExtensionController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IExtensionService iExtensionService;

    @CrossOrigin(origins = "*")
    @GetMapping("/getHomepageAdvert")
    public R getHomepageAdvert(@RequestParam String type) throws RRException{
        List<Extension> getHomepageList = null;
        try {
        if (StringUtils.isBlank(type)){
           throw  new  RRException("type is null");
        }
        getHomepageList = iExtensionService.getAdvertList(type);
        }catch (RRException e){
            throw new  RRException("getHomepageAdvert is false",e);
        }
        return R.ok().put("HomepageAdvert",getHomepageList);
    }
}
