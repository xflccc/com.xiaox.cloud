package com.xiaoxu.api.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *通用返回信息类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String messg;
    private T data;

    /**
     *只返回 code 和 信息 不返回数据
     */
    public CommonResult(Integer code, String messg){
        this(code,messg,null);
    }
}
