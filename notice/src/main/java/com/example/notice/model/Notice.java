package com.example.notice.model;

import lombok.Data;

@Data
public class Notice {

	private int noticeId;		// 게시글ID
	private String title;		// 제목
	private String writer;		// 작성자
	private String content;		// 내용
	private int hitCnt;			// 조회수
	private String regDate;		// 작성시간
	private String updatedAt;	// 수정시간
	private String updaterId;  	// 수정자
	private int isDeleted;		// 삭제여부
}
