package com.video.barrage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 视频类型
     */
    private String type;

    private String img;

    private String video;

    private String title;

    /**
     * 播放量
     */
    private String playbackVolume;

    /**
     * 作者
     */
    private String author;

    /**
     * 点赞数
     */
    private Long thumbsUp;


}
