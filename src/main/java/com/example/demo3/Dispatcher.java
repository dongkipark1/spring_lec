package com.example.demo3;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Dispatcher {
    public static void route(String cmd, String action, HttpServletResponse resp) throws IOException {
        if(cmd.equals("user")){
            UserController con = new UserController();

            if(action.equals("login")){
                String html = con.login();
                resp.getWriter().println(html);
            }else if(action.equals("join")){
                String html = con.join();
                resp.getWriter().println(html);
            }


        }else if(cmd.equals("board")){
            resp.getWriter().println("<h1>board</h1>");
        }
    }
}
