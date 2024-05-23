package com.company.basicBoard.domain.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.company.basicBoard.common.data.RequestList;
import com.company.basicBoard.domain.board.model.Board;

@Mapper
public interface BoardMapper {

	List<Map<String, Object>> ListBoard(RequestList<?> requestList);
	
	int ListBoardCount(Board board);
	
	List<Map<String, Object>> BoardDetail(Board board);
	
	int BoardInsert(RequestList<?> requestList);
	
	int BoardUpdate(RequestList<?> requestList);
	
	int BoardDelete(RequestList<?> requestList);
	
}