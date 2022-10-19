package com.board.api.service;

import com.board.api.dto.TestDTO;
import com.board.api.model.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDAO testDAO;

    @Override
    public List<TestDTO> testList() {
        return testDAO.testList();
    }
}
