package per.boot.service;

import java.util.List;

import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;


public interface AdminService {
	
	public List<BoardVO> getNoticeList() throws Exception;
	public List<BoardVO> getFAQList() throws Exception;
	public List<EventVO> getEventList() throws Exception;
	public String bwsubmit(BoardVO board) throws Exception;
	
}
