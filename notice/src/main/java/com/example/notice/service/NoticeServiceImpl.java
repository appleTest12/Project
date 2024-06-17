package com.example.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notice.mapper.NoticeMapper;
import com.example.notice.model.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;

	@Override
	public List<Notice> selectNoticeList() throws Exception {
		return noticeMapper.selectNoticeList();
	}
	
	@Override
	public void insertNotice(Notice notice) throws Exception {
		noticeMapper.insertNotice(notice);
	}

	@Override
	public Notice selectNoticeDetail(int notice_id) throws Exception {
		noticeMapper.updateHitCount(notice_id);             // 조회수 증가시키기
	  return noticeMapper.selectNoticeDetail(notice_id);
	}
	
	@Override
	public void updateNotice(Notice notice) throws Exception {
		noticeMapper.updateNotice(notice);
	}

	@Override
	public void deleteNotice(int notice_id) throws Exception {
		noticeMapper.deleteNotice(notice_id);
	}
	
	
	
	
	
	
	
}
