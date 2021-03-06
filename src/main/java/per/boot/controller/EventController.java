package per.boot.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import per.boot.service.EventService;
import per.boot.vo.BoardVO;
import per.boot.vo.EventVO;

@RequestMapping("/event/")
@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("test")
	public String test(Model model) throws ClassNotFoundException, SQLException {
		return "root.event.test"; 
	}
	
	
	@RequestMapping("event")
	public String event(Model model) throws ClassNotFoundException, SQLException {
		
		List<EventVO> endList = eventService.getEndList();
		List<EventVO> ingList = eventService.getIngList();
		List<BoardVO> winnerList = eventService.getWinnerList();
		
		model.addAttribute("endList", endList);
		model.addAttribute("ingList", ingList);
		model.addAttribute("winnerList", winnerList);
//		
		return "root.event.event";
	}	
	
	
	@RequestMapping("detail")
	public String detail(@RequestParam(name="p")String page, Model model) throws ClassNotFoundException, SQLException {
		
		EventVO event = eventService.getEvent(page);
		
		model.addAttribute("event", event);
		
		return "root.event.detail";
	}
}
