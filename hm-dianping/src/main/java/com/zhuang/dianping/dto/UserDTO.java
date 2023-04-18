package com.zhuang.dianping.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO {
    private Long id;
    private String nickName;
    private String icon;
}
