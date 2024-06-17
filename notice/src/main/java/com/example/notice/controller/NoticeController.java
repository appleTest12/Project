package com.example.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.notice.model.Notice;
import com.example.notice.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	  NoticeService noticeService;

	  @RequestMapping("/notice/noticeList")
	  public ModelAndView openNoticeList() throws Exception {
	    ModelAndView mv = new ModelAndView("/notice/noticeList");   
	    List<Notice> list = noticeService.selectNoticeList();     
	    mv.addObject("list",list);                               
	    return mv;
	  }
	  
	  @RequestMapping("/notice/openNoticeWrite")
	  public String openNoticeWrite() {
	  return "/notice/noticeWrite";
	}

	@RequestMapping("/notice/insertNotice")
	  public String insertNotice(Notice notice) throws Exception {
		noticeService.insertNotice(notice);
	  return "redirect:/notice/noticeList";
	}
	
	@RequestMapping("/notice/openNoticeDetail")
	public ModelAndView openNoticeDetail(@RequestParam("notice_id") int notice_id) throws Exception{
	  ModelAndView mv = new ModelAndView("/notice/noticeDetail");
	  Notice notice = noticeService.selectNoticeDetail(notice_id);
	  mv.addObject("notice",notice);
	  return mv;
	}
	
	@RequestMapping("/notice/updateNotice")  // 수정요청
	public String updateNotice(Notice notice) throws Exception {
		noticeService.updateNotice(notice);         //게시글 수정
	  return "redirect:/notice/noticeList";  
	}


	@RequestMapping("/notice/deleteNotice")  //삭제요청
	public String deleteNotice(Notice notice) throws Exception {
		noticeService.deleteNotice(notice.getNoticeId());      //게시글 삭제
	  return "redirect:/notice/noticeList";  //삭제완료 후 게시판 목록으로
	}
	
	
	
	
	
}
