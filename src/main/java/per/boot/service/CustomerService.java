package per.boot.service;

import java.util.List;

import per.boot.vo.BoardVO;

public interface CustomerService {
	List<BoardVO> getNoticeList()throws Exception;
	List<BoardVO> getFAQList()throws Exception;	
}
