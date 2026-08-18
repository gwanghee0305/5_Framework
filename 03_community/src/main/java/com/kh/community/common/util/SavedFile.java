package com.kh.community.common.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
 	* 저장된 파일 정보를 담을 객체
 	 - 회원 프로필 이미지 : 저장된 위치
 	 - 게시글의 이미지 : 원본 파일명, 저장된 파일명, 위치
 */
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor	// 해당 어노테이션은 필드에 final 을 붙여야 함. 변하지 않을 값에는 final 을 권장함.
public class SavedFile {
	private final String originalName;	// 원본 파일명
	private final String saveName;		// 저장된 파일명
	private final String path;			// 저장된 위치
}