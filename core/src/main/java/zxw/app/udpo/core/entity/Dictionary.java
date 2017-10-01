package zxw.app.udpo.core.entity;

/**
 * @title: Dictionary
 * @description: 字典类
 * @author: zhangxw
 * @date: 2017/9/27 9:48
 * @params:
 * @returns
 */
public class Dictionary extends CommonEntity{

    private Integer id;

    // 字典Hash值
    private Integer code;

    // 父节点
    private Integer parentId;

    // 子节点
    private Integer childId;

    // 值
    private String content;

    // 状态
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
