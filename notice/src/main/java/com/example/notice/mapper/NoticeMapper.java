package com.example.notice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.notice.model.Notice;

@Mapper
public interface NoticeMapper {

	List<Notice> selectNoticeList() throws Exception;
	void insertNotice(Notice notice) throws Exception;
	void updateHitCount(int notice_id) throws Exception;
	Notice selectNoticeDetail(int notice_id) throws Exception;
	void updateNotice(Notice notice) throws Exception;
	void deleteNotice(int notice_id) throws Exception;
	
	
}
