package com.susanacabrera.springsample.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class HelloWorldController {

   public ModelAndView handleRequest(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {

      String aMessage = "Hello World MVC!";

      ModelAndView modelAndView = new ModelAndView("hello_world");
      modelAndView.addObject("message", aMessage);

      return modelAndView;
   }
}