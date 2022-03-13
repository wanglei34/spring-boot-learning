package com.wl.boot.restful.common;

import lombok.Data;

/**
 * @author 17997
 */

@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse(){
    }

    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object data){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
