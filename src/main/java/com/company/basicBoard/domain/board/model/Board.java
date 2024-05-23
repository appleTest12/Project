package com.company.basicBoard.domain.board.model;

import lombok.Data;


@Data
public class Board {
	private int boardId;			// 게시글ID
	private String writer;			// 작성자
	private String title;			// 제목
	private String content;			// 내용
	private String regDate;			// 등록 일자
	private String updateDate;		// 수정 일자
	private String deleteDate;		// 삭제 일자
}