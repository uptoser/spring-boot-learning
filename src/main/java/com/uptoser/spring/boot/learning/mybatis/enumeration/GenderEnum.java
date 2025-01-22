package com.uptoser.spring.boot.learning.mybatis.enumeration;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {
	MALE(0, "男"),FEMALE(1, "女");

	@EnumValue
	private final int value;
	@JsonValue // 标记将此值用json序列化给前端
	private final String name;

	public static GenderEnum getEnumByValue(int value) {
		for (GenderEnum sex : GenderEnum.values()) {
			if (sex.getValue() == value) {
				return sex;
			}
		}
		return null;
	}

}
