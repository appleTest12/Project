package com.company.basicBoard.domain.board.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import com.company.basicBoard.common.data.RequestList;
import com.company.basicBoard.domain.board.model.Board;

@Mapper
public interface BoardMapper {

	List<Map<String, Object>> getListBoard(RequestList<?> requestList);
	
	int getListBoardCount(Board board);
	
	List<Map<String, Object>> getBoardDetail(Board board);
	
	int getBoardInsert(RequestList<?> requestList);
	
	int getBoardUpdate(RequestList<?> requestList);
	
	int getBoardDelete(RequestList<?> requestList);
}