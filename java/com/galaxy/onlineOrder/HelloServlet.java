package com.galaxy.onlineOrder;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galaxy.onlineOrder.entity.Customer;
import org.json.JSONObject;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

   // public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // response.setContentType("application/json");

        // Hello
        /*PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        JSONObject customer = new JSONObject();
        customer.put("email","abs");
        response.getWriter().println(customer);


        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        Customer customer= new Customer();
        customer.setEmail("sun@laioffer.com");
        customer.setPassword("123456");
        customer.setFirstName("rick");
        customer.setLastName("sun");
        customer.setEnabled(true);

        response.getWriter().print(mapper.writeValueAsString(customer));

    }*/
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        Customer customer= new Customer();
        customer.setEmail("sun@laioffer.com");
        customer.setPassword("123456");
        customer.setFirstName("rick");
        customer.setLastName("sun");
        customer.setEnabled(true);

        response.getWriter().print(mapper.writeValueAsString(customer));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // response.setContentType("application/json");
        JSONObject json = new JSONObject();
        // Hello
        /*PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        JSONObject customer = new JSONObject();
        customer.put("email","abs");
        response.getWriter().println(customer);

         */
    }

    public void destroy() {
    }
}