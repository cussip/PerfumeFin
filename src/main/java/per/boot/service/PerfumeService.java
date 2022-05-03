package per.boot.service;

import java.util.List;

import per.boot.vo.PerfumeVO;

public interface PerfumeService {
	List<PerfumeVO> selectPerfumeList() throws Exception;
	List<PerfumeVO> selectGoodsList() throws Exception;
}
