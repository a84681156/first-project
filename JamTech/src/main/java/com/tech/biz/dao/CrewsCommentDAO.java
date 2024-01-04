package com.tech.biz.dao;

import java.util.List;

import com.tech.biz.domain.CrewsCommentDTO;

public interface CrewsCommentDAO {

	//1. select 댓글번호에 해당하는 댓글 보여주기
	CrewsCommentDTO select(Integer crew_comment_no) throws Exception;

	//2. select 전체 댓글 개수
	int count(Integer crew_post_no) throws Exception;

	//3. insert 댓글 추가 (게시글 번호 제목 내용 작성자)
	int insert(CrewsCommentDTO crewscommentDTO) throws Exception;

	//4. update 번호에 해당하는 댓글의 내용변경
	int update(CrewsCommentDTO crewscommentDTO) throws Exception;

	//5. delete 댓글 번호와 작성자가 일치할 때 게시글 삭제
	int delete(Integer crew_comment_no, String crew_comment_writer) throws Exception;

	//6. 관리자 댓글 삭제
	int deleteForAdmin(Integer crew_comment_no) throws Exception;

	//7. 댓글 전체 삭제 
	int deleteAll(Integer crew_post_no);

	//8. 댓글 목록, 등록일 기준으로 내림차순. 번호를 기준으로 내림차순
	List<CrewsCommentDTO> selectAll(Integer crew_post_no) throws Exception;

}