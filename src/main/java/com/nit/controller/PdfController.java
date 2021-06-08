package com.nit.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.pdf.PdfGenerateTest;
@Controller
public class PdfController {
	@Autowired
	private ServletContext context;
	
	@GetMapping("/pdf")
	public ModelAndView CreatePdfSheet() throws Exception
	{
		File stream=new File("D:\\pdf");
		//FileSystemResource src=new FileSystemResource("D:\\pdf");
		ModelAndView mv= new ModelAndView();
		
		mv.setView(new PdfGenerateTest());
		stream.isDirectory();
		return mv;
		
	}

}
