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
	public ResponseEntity<?> ListBoard(Board board, @PageableDefault(size = 10) Pageable pageable) {
		return ResponseEntity.ok(boardService.ListBoard(board, pageable));
	}
	
	@GetMapping("/detail")
	public ResponseEntity<?> BoardDetail(Board board) {
		return ResponseEntity.ok(boardService.BoardDetail(board));
	}
	
	@GetMapping("/insert")
	public ResponseEntity<?> BoardInsert(Board board) {
		return ResponseEntity.ok(boardService.BoardInsert(board));
	}
	
	@GetMapping("/update")
	public ResponseEntity<?> BoardUpdate(Board board) {
		return ResponseEntity.ok(boardService.BoardUpdate(board));
	}
	
	@GetMapping("/delete")
	public ResponseEntity<?> BoardDelete(Board board) {
		return ResponseEntity.ok(boardService.BoardDelete(board));
	}
	

}