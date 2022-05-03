package per.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import per.boot.dao.PerfumeDAO;
import per.boot.service.PerfumeService;
import per.boot.vo.PerfumeVO;

@Service
public class PerfumeServiceImpl implements PerfumeService {
    
	@Autowired
	private PerfumeDAO perfumeDAO;
		
//	@Transactional
	@Override
	public List<PerfumeVO> selectPerfumeList() throws Exception {
		
		return perfumeDAO.selectPerfumeList();
	}
	
	@Override
	public List<PerfumeVO> selectGoodsList() throws Exception{
		
		return perfumeDAO.selectGoodsList();
	}

}
