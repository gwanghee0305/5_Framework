package com.kh.mybatis.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 기본 생성자 어노테이션
// 모든 필드를 매개변수로 가지는 생성자
// getter
// setter
// toString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class MemberDTO {
	private int id;
	private String name;
	private String email;
	private int age;
	
	
}
