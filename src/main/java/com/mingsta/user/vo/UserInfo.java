package com.mingsta.user.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserInfo {
	String userId;
	String pwd;
	String deviceId;
}
