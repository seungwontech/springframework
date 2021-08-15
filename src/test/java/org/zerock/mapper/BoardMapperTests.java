package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	//private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void testGetList() {
		log.info("여기");
		boardMapper.getList().forEach(board -> log.info(board));;
	}
}