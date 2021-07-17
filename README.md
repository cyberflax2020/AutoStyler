个人项目。由于本人衣服过多，写个程序来自动生成穿搭，同时实现保暖度预估和避免衣服搭配冲突的功能。


使用方法：

首先编辑 input.txt 录入衣服信息，格式为 id/name/type1,type2,type3/warmth/conflict_id1,conflict_id2；

然后运行main.java 生成组合结果；


说明：

id是每件衣服的唯一识别编码；

name为衣服的名字，可以重复；

type包括 Coat, Pants, Shoes, Sweater, Base, Middles, Caps, Accessories，一件衣服可以有多种type；

warmth是每件衣服的保暖程度，最后结果中的warmth是所有单件衣服的加和；

conflict id是与这件衣服冲突的其他所有衣服的id，-1为缺省值；


鉴于本程序已经满足个人现阶段需求，因此暂时不准备进一步更新。但未来可能的改进方向包括：1. 增加可视化UI；2.在程序UI中录入和更改衣服信息；3. 录入衣服图片，生成组合效果预览。
