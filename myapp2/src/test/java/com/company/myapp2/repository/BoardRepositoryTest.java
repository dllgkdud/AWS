package com.company.myapp2.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.myapp2.domain.Board;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepository;
	
/*	//레코드 추가(Insert)
	@Test
	public void testInsert() {
		//IntStream : 동시에 여러건(더미) 입력 - Lambda
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Board board = Board.builder()
					.title("테스트제목"+i)
					.content("테스트내용"+i)
					.writer("user"+i)
					.build();
			//save = insert
			Board result = boardRepository.save(board);
			log.info("BNO : "+result.getBno());
		});
		//fail("Not yet implemented");
	}*/


/* 	//레코드 검색(Select)
	@Test
	public void testSelect() {
		Long bno = 10L;
		Optional<Board> result = boardRepository.findById(bno);
		Board board = result.orElseThrow();
		log.info(board);
	}*/
	
/*	//레코드 수정(Update)
	@Test
	public void testUpdate() {
		Long bno = 8L;
		Optional<Board> result = boardRepository.findById(bno);
		Board board = result.orElseThrow();
		board.change("제목수정본8", "내용수정본8");
		boardRepository.save(board);
	}*/
	
/*	//레코드 삭제(Delete)
	@Test
	public void testDelete() {
		Long bno = 9L;
		boardRepository.deleteById(bno);
	}*/
	
	//레코드 목록(SelectAll)
	@Test
	public void testSelectAll() {
		List<Board> list = boardRepository.findAll();
		for(Board board : list) {
			log.info("POST : "+board.toString());
		}
	}
}
