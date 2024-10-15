package com.feng.common.utils;

import lombok.Getter;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/15 23:54
 * @Version: 1.0
 */
@Getter
public enum Binary {
    YES(1, "是"), NO(0, "否");
    private Integer value;
    private String title;

    Binary(Integer value, String title) {
        this.value = value;
        this.title = title;
    }

}
