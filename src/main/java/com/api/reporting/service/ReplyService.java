package com.api.reporting.service;

import java.util.List;

import com.api.reporting.dto.Criteria;
import com.api.reporting.dto.ReplyVO;

public interface ReplyService {

	public void createReplyService(ReplyVO vo) throws Exception;
	
	public ReplyVO readReplyService(int rno) throws Exception;
	
	public void updateReplyService(ReplyVO vo) throws Exception;
	
	public void deleteReplyService(int rno) throws Exception;
	
	// ����¡ ó�� ��
	public List<ReplyVO> noPageListService(int bno) throws Exception;
	
	// �� ��� ī��Ʈ
	public int replyAllCountService(int bno) throws Exception;
	
	// ����¡ ó��
	public List<ReplyVO> replyPageListService(int bno, Criteria cri) throws Exception;
}
