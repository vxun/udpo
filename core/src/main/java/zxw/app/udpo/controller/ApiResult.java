package zxw.app.udpo.controller;

import java.io.Serializable;

/**
 * @title: ApiResult
 * @description:
 * @author: zhangxw
 * @date: 2017/9/26 21:01
 * @params:
 * @returns
 */
public class ApiResult implements Serializable{

    public int code = 50200;
    public String msg = null;
    public Object data = null;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
