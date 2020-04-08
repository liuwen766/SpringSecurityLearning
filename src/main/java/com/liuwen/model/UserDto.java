package com.liuwen.model;

import lombok.Data;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-08 16:41
 **/
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
