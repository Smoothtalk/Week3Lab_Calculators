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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValString = request.getParameter("first");
        String secondValString = request.getParameter("second");
        String operation = request.getParameter("op");
        String output;
        
        System.out.println(operation);
        
        if(firstValString == null || secondValString == null || firstValString.equals("") || secondValString.equals("")){
            output = "invalid";
        } else {
            try {
                int first = Integer.parseInt(firstValString);
                int second = Integer.parseInt(secondValString);
                
                switch(operation){
                    case "+":
                        break;
                    case "-":
                        break;
                    case "*":
                        break;
                    case "%":
                        break;
                }
                
            } catch(NumberFormatException e){
                output = "invalid";
            }
            
        }
        
        request.setAttribute("first", firstValString);
        request.setAttribute("second", secondValString);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
