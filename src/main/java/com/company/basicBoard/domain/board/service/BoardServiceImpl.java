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
	
	public Page<Map<String, Object>> ListBoard(Board board, Pageable pageable) {
		
		RequestList<?> requestList = RequestList.builder().data(board).pageable(pageable).build();
		
		List<Map<String, Object>> content = boardMapper.ListBoard(requestList);
		int total = boardMapper.ListBoardCount(board);
		
		return new PageImpl<>(content, pageable, total);
	}
	
	@Override
	public Page<Map<String, Object>> BoardDetail(Board board) {
		
		List<Map<String, Object>> content = boardMapper.BoardDetail(board);
		
		return new PageImpl<>(content);
	}
	
	@Override
	public int BoardInsert(Board board) {
		
		RequestList<?> requestList = RequestList.builder().data(board).build();
		
		int content = boardMapper.BoardInsert(requestList);
		
		return content;
	}
	
	@Override
	public int BoardUpdate(Board board) {
		
		RequestList<?> requestList = RequestList.builder().data(board).build();
		
		int content = boardMapper.BoardUpdate(requestList);
		
		return content;
	}
	
	@Override
	public int BoardDelete(Board board) {
		
		RequestList<?> requestList = RequestList.builder().data(board).build();
		
		int content = boardMapper.BoardDelete(requestList);
		
		return content;
	}


}
