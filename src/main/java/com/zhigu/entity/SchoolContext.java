package com.zhigu.entity;

import lombok.Data;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:01
 */
@Data
public class SchoolContext {
    // 学校编码
    private String schoolCode;

    // 处理类型
    private HandleType handleType;

    private String jsonStr;

    private Object result;

    public SchoolContext(String schoolCode, HandleType handleType) {
        this.schoolCode = schoolCode;
        this.handleType = handleType;
    }


    public String getServiceKey() {
        return this.schoolCode + "#" + this.handleType;
    }
}
