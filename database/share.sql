/*
 Navicat Premium Data Transfer

 Source Server         : mydatabase
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : 39.100.66.82:3306
 Source Schema         : share

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 29/11/2020 18:50:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for articles
-- ----------------------------
DROP TABLE IF EXISTS `articles`;
CREATE TABLE `articles`  (
  `article_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `sort_id` bigint(0) NOT NULL,
  `title` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `context` longtext CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `views` bigint(0) NOT NULL,
  `date` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL,
  `like_count` bigint(0) NOT NULL,
  PRIMARY KEY (`article_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of articles
-- ----------------------------
INSERT INTO `articles` VALUES (1, '49082462', 1, 'qetga爱人发生', '发的规划的法规分别是规范化\r\n啥都好舒服\r\n爱过后\r\n啊哈发\r\n发\r\n阿哈尔发哈\r\n安徽发额地方\r\n的粉红色的复杂4\r\n发的货jsf高房价的双方各gfj对方\r\n水电费您是否供货商\r\n风好大\r\n第三方had方便\r\n恢复大圣之怒\r\n上东国际十多个\r\n告诉大家sdzhgdqq红烧冬瓜还加载\r\n施工技术对方金黄色的\r\n招待费哈对方', 0, '1603072288671', 8);
INSERT INTO `articles` VALUES (2, '49082462', 1, 'set噶是否大V', '的撒古巴的方式VG二房东和双方各\r\n达芙妮航\r\n对方就是你做蛋糕1\r\n感觉到那\r\n睡大觉防溺水\r\n发电机你会说fgn规范化的方法\r\nhad放在哪多个\r\n东方金黄色\r\n和打工仔\r\n发收功能市政府工商\r\nsghfhn上方法\r\n尸鬼封尽你家杀伐果断\r\nsfgnsfg其实发给你们是法国\r\n那三个\r\n下功夫gjmsf', 0, '1603339607576', 0);
INSERT INTO `articles` VALUES (3, '49082462', 1, '多少个排山倒海哦IG哦天生几个', '爱国是佛牌价格破损\r\n按实际嘎婆是佛加工\r\n死得更快破案房管局\r\n按时发环境案是否将1\r\ndfhmkldfjh\r\nUI嗨哟个iufhdagolgo哈鲁ID身高hi\r\n个hi阿US改好了\r\n反比ufghadf的覅ugafhlg我hsdffioud\r\n为huoafhgluiaf豆腐ihgiafuld哦哈个\r\n以lhalisqufg\r\n偶很佩服IPO个\r\n为ouhgoaiudfihjgairuhg\r\n以会挂\r\n安徽拉风\r\n打飞机噢ID返回键\r\n乱世打电话给·', 0, '1603247605530', 0);
INSERT INTO `articles` VALUES (4, '588863310', 1, '去阿尔特瑞', '爱上大股东\r\n阿萨德规划\r\nasdgasd\r\nASDFF1DFHS睡个好觉\r\n特点\r\n人的台式机鳄鱼肉团市委\r\n豆腐砂时分到\r\n付货款的金融业\r\n热带鱼接待人\r\n天有多高驾驶人特\r\n设定提回家我输入统计\r\n让他国际化污染特色和他\r\n法规及的收入统一集合\r\n体育课IEtry就fgjsrytj如图今晚色域\r\n热塑二姨太\r\n如图极为热腾腾\r\n而途径我让他', 0, '1603458927953', 0);
INSERT INTO `articles` VALUES (5, '588863310', 1, '阿任何人都发给·', '阿萨德高二狗水电费很难受的规划\r\n阿萨德换个地方\r\nasdgasd\r\n对方生活馆\r\n等富含维\r\n防寒围观·1\r\n对方视为安兔兔\r\n的返回sadsear电负荷\r\n让人很强啊\r\n二月红为其它\r\n哈儿\r\n而何其\r\n而好奇啊\r\n设定发\r\n杀后台\r\n过的痕迹阿魏酸\r\n阿尔和他', 0, '1603072288671', 0);
INSERT INTO `articles` VALUES (6, '588863310', 1, '显示的文字', '显示的文字必须要超出给定的宽度，到这里如果不出意外就可以看到文字滚动了。\r\n当你的界面view太多的时候，往往这个TextView就不一定能够获取到焦点，获取不到焦点也就看不懂跑马灯效果了下面给出解决办法', 0, '1603458927953', 0);
INSERT INTO `articles` VALUES (7, '588863310', 1, '阿萨德个人', '奥古斯丁仁青安二哈梵蒂冈\r\n哈儿\r\n发电火锅\r\n很发达\r\n汇过去阿尔·1\r\n华人网·\r\n花色粉底乳\r\n哈二分·\r\n皇室典范\r\n按合同人工·\r\nhear·1a获取阿尔\r\n哈尔斯hj而它虽然\r\n阿尔 \r\n巧儿宜\r\n他认为红色', 0, '1603339607576', 0);
INSERT INTO `articles` VALUES (9, '281441329', 1, '葳蕤', '葳蕤是一个汉语词汇，拼音是wēi ruí。一指草木茂盛枝叶下垂貌；二指羽毛饰物貌；三指华美貌，艳丽貌；四指柔弱貌；五指萎顿貌；六指锁；七指古代一种首饰；八指草名，即萎蕤。\r\n葳蕤，形容枝叶繁盛，羽毛装饰华丽鲜艳的样子，也可形容植物生长茂盛的样子，也可比喻词藻华丽。该词被2014第二届中国汉字听写大会发起的“全民焐热冰封汉字行动”选为首期焐热词汇。\r\n另外，在中医中是一种药材，也叫玉竹，玉竹有节色淡黄，扁圆弯曲蠕虫样。功用是养阴润肺，益胃生津。用于肺胃阴伤，燥咳痰粘，舌干烦渴，或阴虚外感温邪，发热无汗，干咳咽痛等症。\r\n清代乐钧《探春·宋云墅仪曹座上咏白丁香花》词里写到：莺燕丁宁久，莫轻启，葳蕤金锁', 0, '1603247605530', 0);
INSERT INTO `articles` VALUES (10, '281441329', 1, '螺蛳粉', '螺蛳粉是广西壮族自治区柳州市的特色小吃之一，具有辣、爽、鲜、酸、烫的独特风味。 [1]  是柳州最具地方特色的名小吃。\r\n螺蛳粉的味美还因为它有着独特的汤料。汤料由螺蛳、山奈、八角、肉桂、丁香、多种辣椒、等天然香料和味素配制而成。\r\n2018年8月20日，“柳州螺蛳粉”获得国家地理标志商标 [2]  。\r\n2008年，柳州螺蛳粉手工制作技艺入选广西壮族自治区第二批非物质文化遗产名录。 [3] \r\n2015年，在《柳州螺蛳粉地方标准》、《预包装柳州螺蛳粉地方标准》的第三次修正稿中规定将螺蛳粉的官方英文名定为：“Liuzhou river snails rice noodle”。 [4] \r\n2019年3月21日，螺蛳粉发源地广西柳州官方表示，感谢海外友人的关心，螺蛳粉是广西非遗，正逐步申请国家和世界级非遗 [5]  。', 0, '1603458927953', 0);
INSERT INTO `articles` VALUES (11, '281441329', 1, '猫薄荷', '猫薄荷，别名：樟脑草、凉薄荷、巴毛、小薄荷、薄荷、大茴香、土荆芥、小荆芥、香薷、猫薄荷，拉丁文名：Nepeta cataria L.唇形科、荆芥属多年生直立草本。在中国有时栽培供药用，但不是常用荆芥的正品。（英语：catmint）。', 0, '1603072288671', 0);
INSERT INTO `articles` VALUES (12, '281441329', 1, '生长环境', '喜冷凉、全日照或半日照的环境，植床需要排水良好。 产于欧洲、西南亚中亚，花为淡蓝色，齿状叶，一般常被\r\n荆芥\r\n荆芥\r\n种植于篱边、路边，生长力旺盛，花开经夏。花为白色或淡蓝色，齿状叶，一般常被种植于篱边、路边，或者家中苗圃中。生长力旺盛，花开经夏，常作薰衣草、玫瑰的护边植物，也可以形成蓝色花海。', 0, '1603247605530', 0);
INSERT INTO `articles` VALUES (13, '489009763', 1, '阿萨德高峰', '改为市公司答复哈巴尔浩特的方式三\r\n大师傅好\r\n安尔碘日服号\r\n打哈\r\near发货亲爱额\r\n德发哈市\r\n为返回呢啊\r\n热负荷大\r\n', 0, '1603247605530', 0);
INSERT INTO `articles` VALUES (14, '817556091', 1, '求安慰他给我热', 'had输入法花港饭店东方红隧道\r\n挖核对爱上大股东方式\r\n阿斯蒂芬好尴尬·1sdfha儿童\r\n一哈儿无法无色热我跟他d二大若和绕色多若\r\naSSFHA\r\nAEWRHGR哈尔和他哈无人\r\n和他收入确认特和合同然后\r\n阿尔氧化物哈儿桃花劫\r\n东方红洒脱工业污染EGR`\r\nFHSDARGHSDFGHJ师傅带年华天人永隔\r\n色大富豪特大推介会给对方加\r\n官方见多识广绝代艳后推开门\r\n换个方式大会上让他加我\r\n森岛帆高就没发货JREQ·', 0, '1603339607576', 0);
INSERT INTO `articles` VALUES (15, '49082462', 1, '是搭嘎当覆盖', '发的哈大法官哈代发货水电费哈代发货德发哈市大富豪闪电发货\r\n梵蒂冈皇室典范好地方\r\n跟后面的规划局双方各\r\n各环节的发挥水电费\r\n地方噶事粉红色的桂花树\r\n房管局尸鬼封尽时代光华十多个', 0, '1603072288671', 0);
INSERT INTO `articles` VALUES (16, '49082462', 1, '11112222', '放大和格式搭嘎地方噶地方\r\n大富豪闪电发货个地方\r\n的士速递发挥地方\r\n认识大概行当封侯归撒地方\r\n阿瑞斯搭嘎富商大贾\r\n闪电发货森岛帆高红烧冬瓜yulfhjlk\r\n王二会告诉对方好地方\r\n的方式上岛费皇室典范森岛帆高恢复规划\r\n是大润发提个建议时代峰峻\r\n房管局市房管局是否该\r\n事件回调的规范化水电费\r\n体育飞快吐口水让他\r\n法语课了丰田与科研', 0, '1603339607576', 14);
INSERT INTO `articles` VALUES (21, '49082462', 0, '发发发', 'v不过GG', 0, '1603072288671', 27);
INSERT INTO `articles` VALUES (24, '49082462', 0, '都给他润肤乳噶地方GV', '发货单噶地方噶的分隔符搭嘎地方反倒是不知道分别涨跌幅法规及打印机送人头\n复工加速福建省信任感mjdghkgf更何况放高考假\nVG空间大公鸡', 0, '1603247605530', 0);
INSERT INTO `articles` VALUES (26, '49082462', 0, '去去去', '1\n1\n1\n1\n1\n1\n\n1\n1\n1\n1\n1\n1\n1\n1\n1\n\n1\n1\n1\n1\n1\n\n1\n1', 0, '1603339607576', 0);
INSERT INTO `articles` VALUES (31, '155780337', 0, '少喝点酒', '大酱炒鸡蛋', 0, '1603458927953', 10);

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `article_id` int(0) NOT NULL,
  `like_count` int(0) NULL DEFAULT NULL,
  `date` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (1, '49082462', 26, NULL, '1603359786012', '去去去去');
INSERT INTO `comments` VALUES (2, '49082462', 26, NULL, '1603365108097', '啊安静的决定');
INSERT INTO `comments` VALUES (3, '49082462', 25, NULL, '1603366034017', '你好');
INSERT INTO `comments` VALUES (4, '49082462', 25, NULL, '1603366226794', '嘻嘻嘻');
INSERT INTO `comments` VALUES (5, '49082462', 26, NULL, '1603366360928', '哈哈哈');
INSERT INTO `comments` VALUES (6, '281441329', 26, NULL, '1603367513694', '就喜欢的活动');
INSERT INTO `comments` VALUES (7, '281441329', 26, NULL, '1603367526682', '不行就得计算机');
INSERT INTO `comments` VALUES (11, '155780337', 26, NULL, '1603368615725', '我我我');
INSERT INTO `comments` VALUES (14, '155780337', 25, NULL, '1603368818600', '学习');
INSERT INTO `comments` VALUES (17, '155780337', 24, NULL, '1603379458348', '精神上的');
INSERT INTO `comments` VALUES (19, '155780337', 23, NULL, '1603419570728', '');
INSERT INTO `comments` VALUES (20, '155780337', 23, NULL, '1603419572884', '');
INSERT INTO `comments` VALUES (21, '155780337', 23, NULL, '1603419573380', '');
INSERT INTO `comments` VALUES (22, '155780337', 23, NULL, '1603419573611', '');
INSERT INTO `comments` VALUES (23, '155780337', 23, NULL, '1603419573793', '');
INSERT INTO `comments` VALUES (24, '155780337', 26, NULL, '1603429731275', '哦哦哦');
INSERT INTO `comments` VALUES (25, '155780337', 23, NULL, '1603446386223', '');
INSERT INTO `comments` VALUES (27, '49082462', 31, NULL, '1606632708420', '打个广告');

-- ----------------------------
-- Table structure for friends
-- ----------------------------
DROP TABLE IF EXISTS `friends`;
CREATE TABLE `friends`  (
  `user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `friends_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of friends
-- ----------------------------
INSERT INTO `friends` VALUES ('588863310', '49082462');
INSERT INTO `friends` VALUES ('281441329', '49082462');
INSERT INTO `friends` VALUES ('281441329', '588863310');
INSERT INTO `friends` VALUES ('489009763', '49082462');
INSERT INTO `friends` VALUES ('817556091', '49082462');
INSERT INTO `friends` VALUES ('49082462', '698262069');
INSERT INTO `friends` VALUES ('479353558', '49082462');
INSERT INTO `friends` VALUES ('155780337', '49082462');
INSERT INTO `friends` VALUES ('49082462', '588863310');

-- ----------------------------
-- Table structure for sorts
-- ----------------------------
DROP TABLE IF EXISTS `sorts`;
CREATE TABLE `sorts`  (
  `id` int(0) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  `description` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sorts
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `password` varchar(15) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL,
  `power` int(0) NOT NULL,
  `registration_time` text CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('155780337', '行行行', '111111', 1, '1603271034297');
INSERT INTO `users` VALUES ('281441329', '龙龙', '111111', 1, '1603270919952');
INSERT INTO `users` VALUES ('479353558', '去去', '111111', 1, '1603270919952');
INSERT INTO `users` VALUES ('489009763', '嘻嘻嘻', '111111', 1, '1603270919952');
INSERT INTO `users` VALUES ('49082462', 'admin', '111', 1, '1603080358430');
INSERT INTO `users` VALUES ('588863310', '哈哈', '111111', 1, '1603015479262');
INSERT INTO `users` VALUES ('623399090', '我的天', '111', 1, '1606645786400');
INSERT INTO `users` VALUES ('623661487', '666', '111111', 1, '1603015479262');
INSERT INTO `users` VALUES ('698262069', '111', '111111', 1, '1603080358430');
INSERT INTO `users` VALUES ('817556091', '哦哦哦', '111111', 1, '1603080358430');
INSERT INTO `users` VALUES ('90723500', '小星星', '111111', 1, '1606645864702');

SET FOREIGN_KEY_CHECKS = 1;
