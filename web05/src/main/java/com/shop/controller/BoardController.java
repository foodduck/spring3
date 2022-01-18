package com.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController extends HttpServlet {
	private final static Logger logger = LoggerFactory.getLogger(BoardController.class);
    
	   @Inject
	   private BoardService service;
}
