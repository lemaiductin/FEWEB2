package com.rs.feweb2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/index")
  public String home(Model model) {
    model.addAttribute("name", "Spring Boot");
    return "index"; // Trả về file index.html trong thư mục templates
  }
}
