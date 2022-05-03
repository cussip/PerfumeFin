package per.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;

@Mapper
public interface AdminDAO {

	List<BoardVO> getNoticeList() throws Exception;
	List<BoardVO> getFAQList() throws Exception;
	List<EventVO> getEventList() throws Exception;
	
}
