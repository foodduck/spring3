package com.shop.controller;

import javax.inject.Inject;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private final static Logger logger = LoggerFactory.getLogger(BoardController.class);
       
   @Inject
   private MemberService service;

}
