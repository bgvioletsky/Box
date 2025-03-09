/*
 * @Author: bgcode
 * @Date: 2025-03-09 16:00:22
 * @LastEditTime: 2025-03-09 16:03:25
 * @LastEditors: bgcode
 * @Description: 描述
 * @FilePath: /Box/app/src/main/java/com/github/tvbox/bgcode/bean/AbsSortXml.java
 * 本项目采用GPL 许可证，欢迎任何人使用、修改和分发。
 */
package com.github.tvbox.bgcode.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.List;

/**
 * @author pj567
 * @date :2020/12/18
 * @description:
 */
@XStreamAlias("rss")
public class AbsSortXml implements Serializable {
    @XStreamAlias("class")
    public MovieSort classes;

    @XStreamAlias("list")
    public Movie list;

    public List<Movie.Video> videoList;
}