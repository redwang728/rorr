package com.my.controlle;

import com.my.config.Myconst;
import com.my.model.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {


  public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(new HandlerInterceptorAdapter() {

          @Override
          public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                   Object handler) throws Exception {


        	  String url = request.getRequestURI();
        	  if ("/index".equals(url)||
                      "/about".equals(url)||
                      "/contact".equals(url)||
                      "/job".equals(url)||
                      "/product".equals(url)||
                      "/serve".equals(url))
        	  {
        		  return true;
        	  }

			  response.sendRedirect("/index");
			  return false;
          }


          @Override
          public void afterCompletion(
                  HttpServletRequest request, HttpServletResponse response,
                  Object handler, Exception ex)
                  throws Exception
                  {}



      }).addPathPatterns("/**");
  }
}