package per.boot.service;

import java.util.List;

import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;


public interface AdminService {
	
	public List<BoardVO> getNoticeList() throws Exception;
	public List<BoardVO> getFAQList() throws Exception;
	public List<EventVO> getEventList() throws Exception;
	
//	
//	public void bwsubmit(BoardVO board) throws SQLException {
//		
//		String title = board.getTitle();
//		String content = board.getContent();
//		
//		String sql = " INSERT INTO board VALUES ( "
//				+ "        board_seq.nextval, "
//				+ "        0, "
//				+ "        ?, "
//				+ "        ?, "
//				+ "        sysdate, "
//				+ "        'notice'"
//				+ "        ) ";
//		
//		Connection con = dataSource.getConnection();
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setString(1, title);
//		st.setString(2, content);
//		
//		ResultSet rs = st.executeQuery();
//		
//		rs.close();
//		st.close();
//		con.close();		
//	}
//	
}
