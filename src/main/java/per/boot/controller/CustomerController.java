package per.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.boot.service.CustomerService;
import per.boot.vo.BoardVO;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
		
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("notice")
	public String notice(Model model) throws Exception {
		
		List<BoardVO> noticeList = customerService.getNoticeList();
		List<BoardVO> faqList = customerService.getFAQList();
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("faqList", faqList);
		
		return "root.customer.notice";
	}	
}