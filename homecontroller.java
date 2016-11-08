package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {
@RequestMapping("/home.jsp")
public String home()
{
return "home";
}
@RequestMapping("/home")
public String home1()
{
return "home";
}

@RequestMapping("/about")
public String about()
{
return "about us";
}
@RequestMapping("/login")
public String login()
{
return "login.jsp";
}
@RequestMapping("/signup")
public String signup()
{
return "signup";
}

}
