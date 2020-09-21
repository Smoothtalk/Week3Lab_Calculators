package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 775653
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String stringAge = request.getParameter("age");
        String output;  
        
        if(stringAge == null || stringAge.equals("")){
            output = "You must give your current age";
        } else {
            try {
                int nextAge = Integer.parseInt(stringAge) + 1;
                output = "Your next birthday will be " + nextAge;
            } catch (NumberFormatException e) {
                output = "You must enter a number";
            } 
        }
        request.setAttribute("output", output);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
