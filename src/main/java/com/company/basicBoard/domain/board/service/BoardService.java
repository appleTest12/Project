package com.company.basicBoard.domain.board.service;

import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.company.basicBoard.domain.board.model.Board;

public interface BoardService {

	public Page<Map<String, Object>> getListBoard(Board board, Pageable pageable);
	
	public Page<Map<String, Object>> getBoardDetail(Board board);
	
	public int getBoardInsert(Board board);
	
	public int getBoardUpdate(Board board);
	
	public int getBoardDelete(Board board);
}