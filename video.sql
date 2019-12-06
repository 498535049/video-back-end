/*
 Navicat Premium Data Transfer

 Source Server         : video
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : localhost:3306
 Source Schema         : video

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : 65001

 Date: 06/12/2019 16:01:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for barrage
-- ----------------------------
DROP TABLE IF EXISTS `barrage`;
CREATE TABLE `barrage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `video_id` int(11) NULL DEFAULT NULL,
  `barrage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `barrage_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of barrage
-- ----------------------------
INSERT INTO `barrage` VALUES (1, 1, 'nbnbnbnbnb', '00:01:10');

-- ----------------------------
-- Table structure for extension
-- ----------------------------
DROP TABLE IF EXISTS `extension`;
CREATE TABLE `extension`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `extension_ad` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of extension
-- ----------------------------
INSERT INTO `extension` VALUES (1, 'http://www.baidu.com', 'advert1', '百度', 'homepage');
INSERT INTO `extension` VALUES (2, 'http://www.baidu.com', 'advert2', '腾讯', 'homepage');
INSERT INTO `extension` VALUES (3, 'http://www.baidu.com', 'advert3', '网易', 'homepage');
INSERT INTO `extension` VALUES (4, 'http://www.baidu.com', 'advert4', '阿里', 'homepage');

-- ----------------------------
-- Table structure for homepage
-- ----------------------------
DROP TABLE IF EXISTS `homepage`;
CREATE TABLE `homepage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of homepage
-- ----------------------------
INSERT INTO `homepage` VALUES (1, '第一第一第一第一第一第一第一第一', '1', '1', '轮播');
INSERT INTO `homepage` VALUES (2, '第二第二', '2', '2', '轮播');
INSERT INTO `homepage` VALUES (3, '第三第三', '3', '3', '轮播');
INSERT INTO `homepage` VALUES (4, '第四', '4', '4', '轮播');
INSERT INTO `homepage` VALUES (5, '第五第五', '5', '5', 'normal');
INSERT INTO `homepage` VALUES (6, '第六第六', '6', '6', 'normal');
INSERT INTO `homepage` VALUES (7, '第七第七第七第七', '7', '7', 'normal');
INSERT INTO `homepage` VALUES (8, '第八第八第八', '8', '8', 'normal');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频类型',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `playback_volume` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '播放量',
  `author` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者',
  `thumbs_up` bigint(255) NULL DEFAULT NULL COMMENT '点赞数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES (1, '动画', ' ../img/1.jpg', 'movie', '而保持稳步i为', '1000', '无名', 500);
INSERT INTO `video` VALUES (2, '动画', '../img/1.jpg', 'movie', '费事的', '2', '无名', 500);
INSERT INTO `video` VALUES (3, '动画', '../img/2.jpg', 'movie', '分如果突然', '400', '无名', 500);
INSERT INTO `video` VALUES (4, '动画', '../img/5.jpg', 'movie', '肥沃富饶', '400', '前完成', 500);
INSERT INTO `video` VALUES (6, '完结', '../img/7.jpg', 'movie', '完结动漫', '1111', '李四', 200);
INSERT INTO `video` VALUES (5, '连载', '../img/6.jpg', 'movie', '连载番剧111', '30000', '张三', 100);
INSERT INTO `video` VALUES (7, '原创', '../img/8.jpg', 'movie', '原创视频', '100', '王五', 100);
INSERT INTO `video` VALUES (8, '翻唱', '../img/4.jpg', 'movie', '翻唱音乐', '200', '赵六', 5);

SET FOREIGN_KEY_CHECKS = 1;
