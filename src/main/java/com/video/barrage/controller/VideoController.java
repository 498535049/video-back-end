package com.video.barrage.controller;


import com.video.barrage.entity.Video;
import com.video.barrage.service.IVideoService;
import com.video.barrage.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
@RestController
@RequestMapping("/video")
public class VideoController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IVideoService iVideoService;


    @CrossOrigin(origins = "*")
    @PostMapping("/getvideo")
    public R getVideoList(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("video_id");
        Long videoID = Long.parseLong(id);
        Video video = iVideoService.getVideoById(videoID);
        return R.ok().put("video",video);
    }

}
