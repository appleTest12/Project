package com.company.basicBoard.domain.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.basicBoard.domain.board.model.Board;
import com.company.basicBoard.domain.board.service.BoardService;

@RestController
@RequestMapping(value = "/boards")
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("")
	public ResponseEntity<?> getListBoard(Board board, @PageableDefault(size = 10) Pageable pageable) {
		return ResponseEntity.ok(boardService.getListBoard(board, pageable));
	}
	
	@GetMapping("/detail")
	public ResponseEntity<?> getBoardDetail(Board board) {
		return ResponseEntity.ok(boardService.getBoardDetail(board));
	}
	
	@GetMapping("/insert")
	public ResponseEntity<?> getBoardInsert(Board board) {
		return ResponseEntity.ok(boardService.getBoardInsert(board));
	}
	
	@GetMapping("/update")
	public ResponseEntity<?> getBoardUpdate(Board board) {
		return ResponseEntity.ok(boardService.getBoardUpdate(board));
	}
	
	@GetMapping("/delete")
	public ResponseEntity<?> getBoardDelete(Board board) {
		return ResponseEntity.ok(boardService.getBoardDelete(board));
	}

}