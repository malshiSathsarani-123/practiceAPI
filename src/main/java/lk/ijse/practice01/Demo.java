package lk.ijse.practice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "example", urlPatterns = "/example")
public class Demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Last Path: "+req.getServletPath());
        String name = req.getHeader("name");
        Integer contact = Integer.valueOf(req.getParameter("contact"));
        System.out.println(name);
        System.out.println(contact);
    }
}
