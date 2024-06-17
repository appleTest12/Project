package com.example.notice.service;

import java.util.List;

import com.example.notice.model.Notice;

public interface NoticeService {

	List<Notice> selectNoticeList() throws Exception;
	
	void insertNotice(Notice notice) throws Exception;

	Notice selectNoticeDetail(int notice_id) throws Exception;

	void updateNotice(Notice notice) throws Exception;
	
	void deleteNotice(int notice_id) throws Exception;

}
