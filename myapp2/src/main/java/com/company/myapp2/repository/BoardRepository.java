package com.company.myapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.myapp2.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
