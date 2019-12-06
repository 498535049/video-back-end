package com.video.barrage.controller;


import com.video.barrage.entity.Homepage;
import com.video.barrage.exception.RRException;
import com.video.barrage.service.IHomepageService;
import com.video.barrage.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
@RequestMapping("/homepage")
public class HomepageController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IHomepageService iHomepageService;

    @CrossOrigin(origins = "*")
   @GetMapping("/getlist")
    public R getHomepage(@RequestParam String type){
       if (type.isEmpty()){
        throw new RRException("type is null");
       }
       List<Homepage> getHomepageList;
       try {
           getHomepageList = iHomepageService.queryWheelPlantingListBytype(type);
       }catch (RRException e){
           e.setCode(100);
           e.setMsg("getHomepage is bad");
          throw new  RRException("getHomepage is false");
       }
      return R.ok().put("homepagelist",getHomepageList);
   }
}
