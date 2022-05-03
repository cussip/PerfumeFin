package per.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.boot.dao.CustomerDAO;
import per.boot.service.CustomerService;
import per.boot.vo.BoardVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;
	
	@Override
	public List<BoardVO> getNoticeList() throws Exception {
		
		List<BoardVO> noticeList = customerDao.getNoticeList();		
		return noticeList;		
	}
	
	@Override
	public List<BoardVO> getFAQList() throws Exception {
		
		List<BoardVO> faqList = customerDao.getFAQList();
		return faqList;		
	}
	
}
