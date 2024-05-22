package com.company.basicBoard.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	/**
	 * 기본 경로 : 게시판 페이지 호출
	 */
	@GetMapping("")
	public String home() {
		return "redirect:board";
	}

	/**
	 * 게시판 페이지 호출
	 */
	@GetMapping("/board")
	public String board() {
		return "views/board/list";
	}
	
	/**
	 * 게시판 상세
	 */
	@GetMapping("/detail")
	public String detail() {
		return "views/board/detail";
	}
	
	/**
	 * 게시판 등록
	 */
	@GetMapping("/write")
	public String write() {
		return "views/board/write";
	}
	
	/**
	 * 게시판 수정
	 */
	@GetMapping("/modfiy")
	public String modfiy() {
		return "views/board/modfiy";
	}
	
	
	/**
	 * 게시판 삭제
	 */
	@GetMapping("/view")
	public String view() {
		return "views/board/view";
	}
}