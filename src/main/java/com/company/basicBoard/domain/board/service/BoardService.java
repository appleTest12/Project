package com.company.basicBoard.domain.board.service;

import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.company.basicBoard.domain.board.model.Board;

public interface BoardService {

	public Page<Map<String, Object>> ListBoard(Board board, Pageable pageable);
	
	public Page<Map<String, Object>> BoardDetail(Board board);
	
	public int BoardInsert(Board board);
	
	public int BoardUpdate(Board board);
	
	public int BoardDelete(Board board);
}