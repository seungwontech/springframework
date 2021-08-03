package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;

	@GetMapping("/list")
	//public void list(Criteria cri, Model model) {
	public void list(Model model) {
		model.addAttribute("list", service.getList());
	//	model.addAttribute("pageMaker", new PageDTO(cri,123));
		int total = service.getTotal();
//		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	// 등록
//	@GetMapping("/register")
//	public void register() {
//
//	}
//
//	// 등록
//	@PostMapping("/register")
//	public String register(BoardVO board, RedirectAttributes rttr) {
//		service.register(board);
//		//rttr.addFlashAttribute("result", board.getBno());
//		return "redirect:/board/list";
//	}
//
//	// 자세히보기/수정페이지
//	@GetMapping({"/get","/modify"})
//	public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
//		model.addAttribute("board", service.get(bno));
//	}
//
//	// 수정
//	@PostMapping("/modify")
//	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
//		if (service.modify(board)) {
//			rttr.addFlashAttribute("result" + "success");
//		}
//		return "redirect:/board/list" +cri.getListLink();
//
//	}
//	// 삭제
//	@PostMapping("/remove")
//	public String remove(@RequestParam("bno") Long bno, Criteria cri, RedirectAttributes rttr) {
//		if (service.remove(bno)) {
//			rttr.addFlashAttribute("result", "success");
//		}
//		return "redirect:/board/list"+cri.getListLink();
//
//	}
}
