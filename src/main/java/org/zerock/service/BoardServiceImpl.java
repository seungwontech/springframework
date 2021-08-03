package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	@Autowired
	
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		mapper.insert(board);
	}
	@Override
	public BoardVO get(Long bno) {
		return mapper.read(bno);
	}
	@Override
	//수정
	public boolean modify(BoardVO board) {
		return mapper.update(board) ==1;
	}
	@Override
	//삭제
	public boolean remove(Long bno) {
		return mapper.delete(bno)==1;
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getListWithPaging();
	}
	@Override
	public int getTotal() {
		return mapper.getTotalCount();
	}
	
}
