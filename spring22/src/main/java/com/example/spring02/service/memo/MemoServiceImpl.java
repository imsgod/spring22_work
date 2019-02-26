package com.example.spring02.service.memo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.memo.dao.MemoDAO;
import com.example.spring02.model.memo.dto.MemoDTO;

@Service
public class MemoServiceImpl implements MemoService {

	@Inject  
	MemoDAO memoDao;  	 

	@Override
	public List<MemoDTO> list() {
		return memoDao.list();   
	}

	@Override
	public void insert(MemoDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemoDTO memo_view(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(MemoDTO dto) {
		// TODO Auto-generated method stub

	}

}
