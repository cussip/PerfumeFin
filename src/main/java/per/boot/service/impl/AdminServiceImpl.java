package per.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.boot.dao.AdminDAO;
import per.boot.service.AdminService;
import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDao;

	@Override
	public List<BoardVO> getNoticeList() throws Exception {

		List<BoardVO> noticeList = adminDao.getNoticeList();
		return noticeList;
	}

	@Override
	public List<BoardVO> getFAQList() throws Exception {
		
		List<BoardVO> FAQList = adminDao.getFAQList();
		return FAQList;
	}

	@Override
	public List<EventVO> getEventList() throws Exception {
		
		List<EventVO> eventList = adminDao.getEventList();
		return eventList;
	}

	@Override
	public String bwsubmit(BoardVO board) throws Exception {
		
		return adminDao.bwsubmit(board);
		
	}

}
