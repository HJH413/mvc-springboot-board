package com.board.api.model;

import com.board.api.dto.TestDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDAO {

    List<TestDTO> testList();
}
