package com.example.s13firstspringproject;

import com.example.s13firstspringproject.exceptions.UnauthorizedException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoggedInterceptor implements HandlerInterceptor {

//    @Override
//    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
//        HttpSession session = request.getSession();
//        boolean newSession = session.isNew();
//        boolean logged = session.getAttribute(LOGGED) != null && ((Boolean)session.getAttribute(LOGGED));
//        boolean sameIP = request.getRemoteAddr().equals(session.getAttribute(LOGGED_FROM));
//        if(newSession || !logged || !sameIP){
//            throw new UnauthorizedException("You have to login!");
//        }
//        return true;
//    }
}
