package com.company.basicBoard.domain.board.model;

import lombok.Data;

@Data
public class Board {
	private int boardId;
	private String writer;
	private String title;
	private String content;
	private String regDate;
	private String updateDate;
	private String deleteDate;
}