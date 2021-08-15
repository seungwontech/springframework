package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
//DB를 사용해 데이터를 조회하거나 조작하는 기능을 담당하는 것들을 DAO라고 부른다.
public interface BoardMapper {
	
	public List<BoardVO> getList();
	
}
