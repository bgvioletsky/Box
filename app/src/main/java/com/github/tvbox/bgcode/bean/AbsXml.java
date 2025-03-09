/**
 * @Author: bgcode
 * @Date: 2025-03-09 16:00:22
 * @LastEditTime: 2025-03-09 16:03:32
 * @LastEditors: bgcode
 * @Description: 描述
 * @FilePath: /Box/app/src/main/java/com/github/tvbox/bgcode/bean/AbsXml.java
 * 本项目采用GPL 许可证，欢迎任何人使用、修改和分发。
 */
package com.github.tvbox.bgcode.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;


@XStreamAlias("rss")
public class AbsXml implements Serializable {
    @XStreamAlias("list")
    public Movie movie;

    @XStreamAlias("msg")
    public String msg;
}
