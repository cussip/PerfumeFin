package per.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.boot.service.AdminService;
import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("board")
	public String insertboard(Model model) throws Exception {
		
		
		List<BoardVO> noticeList = adminService.getNoticeList();
		List<BoardVO> faqList = adminService.getFAQList();
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("faqList", faqList);
	
		
		return "admin.board";
	}
	
	@RequestMapping("event")
	public String insertevent(Model model) throws Exception {
		
		
		List<BoardVO> noticeList = adminService.getNoticeList();
		List<BoardVO> faqList = adminService.getFAQList();
		List<EventVO> eventList = adminService.getEventList();
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("faqList", faqList);
		model.addAttribute("eventList", eventList);
	
		
		return "admin.event";
	}
	
//	@RequestMapping("bwsubmit")
//	public String bwsubmit(@ModelAttribute BoardVO board) throws SQLException {
//		
//		adminService.bwsubmit(board);
//		
//		return "root.customer.notice";
//	}	
	
}








