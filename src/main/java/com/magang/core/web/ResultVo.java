package com.magang.core.web;

import java.io.Serializable;

/**
 * Created by magang on 2017/9/13.
 */
public class ResultVo implements Serializable{
    private boolean success;
    private String msg;
    private Object obj;

    public ResultVo(boolean success) {
        this.success = success;
    }

    public ResultVo() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultVo resultVo = (ResultVo) o;

        if (success != resultVo.success) return false;
        if (msg != null ? !msg.equals(resultVo.msg) : resultVo.msg != null) return false;
        return obj != null ? obj.equals(resultVo.obj) : resultVo.obj == null;

    }

    @Override
    public int hashCode() {
        int result = (success ? 1 : 0);
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (obj != null ? obj.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
