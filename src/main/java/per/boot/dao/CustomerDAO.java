package per.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import per.boot.vo.BoardVO;

@Mapper
public interface CustomerDAO {

	List<BoardVO> getNoticeList() throws Exception;
	List<BoardVO> getFAQList() throws Exception;

}
 