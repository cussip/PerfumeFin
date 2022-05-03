package per.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import per.boot.vo.PerfumeVO;

@Mapper
public interface PerfumeDAO {
	List<PerfumeVO> selectPerfumeList() throws Exception;
	List<PerfumeVO> selectGoodsList() throws Exception;
}
