package com.kh.community.board.model.dto;

import java.time.LocalDateTime;

/*
 * COMMENT_ID  NUMBER(19)     NOT NULL,
    BOARD_ID    NUMBER(19)     NOT NULL,
    MEMBER_ID   VARCHAR2(50),
    CONTENT     VARCHAR2(1000) NOT NULL,
    CREATE_AT 
 */
public class CommentDTO {
	// TB_COMMENT 기준으로 필드 정의
	private int commentId;
	private Long boardId;
	private String memberId;
	private String content;
	private LocalDateTime createAt;
	
}
