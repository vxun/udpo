package zxw.app.udpo.core.entity;

import java.util.Date;

/**
 * @title: CommonEntity
 * @description: 基础表字段, 年月日为date, 只有时间为time, 年月日时分秒为timestamp
 * @author: zhangxw
 * @date: 2017/9/27 9:52
 * @params:
 * @returns
 */
public class CommonEntity {

    private Integer id;

    private Date createdTimeStamp;

    private Date modifiedTimeStamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public void setCreatedTimeStamp(Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    public Date getModifiedTimeStamp() {
        return modifiedTimeStamp;
    }

    public void setModifiedTimeStamp(Date modifiedTimeStamp) {
        this.modifiedTimeStamp = modifiedTimeStamp;
    }
}
