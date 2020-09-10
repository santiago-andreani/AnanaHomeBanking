package com.anana.homebanking.views;

import com.anana.homebanking.security.Roles;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewsController {

    @RequestMapping({"index", "login"})
    public String indexView() {
        return "index";
    }

    @RequestMapping("home")
    public String homeRedirectView(Authentication authentication) {
        String authority = authentication.getAuthorities().toString();

        if(authority.contains(String.valueOf(Roles.ADMIN)))
           return "admin/home";
        else if(authority.contains(String.valueOf(Roles.USER)))
            return "user/home";
        else
            return "index";
    }


}
