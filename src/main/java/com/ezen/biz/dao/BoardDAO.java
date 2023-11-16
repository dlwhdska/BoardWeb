package com.ezen.biz.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

//@Repository
public class BoardDAO extends SqlSessionDaoSupport {
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	// 게시글 작성
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 처리");
		
		getSqlSession().insert("BoardMapper.insertBoard", vo);
	}
	
	// 게시글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 처리");
		
		getSqlSession().update("BoardMapper.updateBoard", vo);
	}
	
	// 게시글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 처리");
		
		getSqlSession().delete("BoardMapper.deleteboard", vo);
	}
	
	// 게시글 상세 조회 - seq 번호에 의한 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoard() 처리");
		
		return getSqlSession().selectOne("BoardMapper.getBoard", vo);
	}
	
	// 게시글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardList() 처리");
		
		return getSqlSession().selectList("BoardMapper.getBoardList_D", vo);
	}

}
















