package com.wl.boot.domain;

import com.wl.boot.util.FormatUtils;
import lombok.Data;

import java.util.Date;

/**
 * @author 17997
 */
@Data
public class AccessLog {
    /**
     * 访问者用户名
     */
    private  String username;
    /**
     * 请求路劲
     */
    private String uri;
    /**
     * 请求消耗时长
     */
    private Integer duration;
    /**
     * http方法：GET、POST
     */
    private String httpMethod;
    /**
     * 请求状态码
     */
    private Integer httpStatus;
    /**
     * 访问者ip
     */
    private String ip;
    /**
     * 此条记录的创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "{" + "username=" + this.username + "," + "uri=" + this.uri + "," + "duration=" + this.duration + "," + "httpMethod=" + this.httpMethod + "," + "httpStatus=" + this.httpStatus + "," + "ip=" + this.ip + "," + "createTime=" + FormatUtils.forTime(this.createTime) + "}";
    }
}
