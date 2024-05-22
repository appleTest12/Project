package com.company.basicBoard.domain.board.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.company.basicBoard.common.data.RequestList;
import com.company.basicBoard.domain.board.mapper.BoardMapper;
import com.company.basicBoard.domain.board.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public Page<Map<String, Object>> getListBoard(Board board, Pageable pageable) {
		RequestList<?> requestList = RequestList.builder()
				.data(board)
				.pageable(pageable)
				.build();
		
		List<Map<String, Object>> content = boardMapper.getListBoard(requestList);
		int total = boardMapper.getListBoardCount(board);
		
		return new PageImpl<>(content, pageable, total);
	}
	
	@Override
	public Page<Map<String, Object>> getBoardDetail(Board board) {
		
		List<Map<String, Object>> content = boardMapper.getBoardDetail(board);
		
		return new PageImpl<>(content);
	}
	
	@Override
	public int getBoardInsert(Board board) {
		RequestList<?> requestList = RequestList.builder()
				.data(board)
				.build();
		
		int content = boardMapper.getBoardInsert(requestList);
		
		return content;
	}
	
	@Override
	public int getBoardUpdate(Board board) {
		RequestList<?> requestList = RequestList.builder()
				.data(board)
				.build();
		
		int content = boardMapper.getBoardUpdate(requestList);
		
		return content;
	}
	
	@Override
	public int getBoardDelete(Board board) {
		RequestList<?> requestList = RequestList.builder()
				.data(board)
				.build();
		
		int content = boardMapper.getBoardDelete(requestList);
		
		return content;
	}
}