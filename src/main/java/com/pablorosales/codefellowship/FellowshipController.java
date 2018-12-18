package com.pablorosales.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FellowshipController {

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public String landingPage(){
    return "landing.html";
  }
}
