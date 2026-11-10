package web.baitapbuoi3html;

import java.io.*;

import businessclass.User;
import businessclass.Survey;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        if (action.equals("join")){
            url = "/index.html";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            String hearAbout = request.getParameter("hearAbout");
            String announcementLike = request.getParameter("announcementLike");
            String announcementSend = request.getParameter("announcementSend");
            String[] contactMethodsArray = request.getParameterValues("contactMethod");
            String contactMethodString = "";
            if (contactMethodsArray != null) {
                contactMethodString = String.join(", ", contactMethodsArray);
            }

            User user = new User(firstName, lastName, email, date);
            Survey survey = new Survey(hearAbout, announcementLike, announcementSend, contactMethodString);
            request.setAttribute("user", user);
            request.setAttribute("survey", survey);



            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}