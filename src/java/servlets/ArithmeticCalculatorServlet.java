
package servlets;

/**
 *
 * @author neo
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet{
    String answer ="---";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        answer ="---";
        request.setAttribute("answer", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
            int first = Integer.parseInt(request.getParameter("firstIn"));
            int second = Integer.parseInt(request.getParameter("secondIn"));

            request.setAttribute("answer", answer);

            String operator = request.getParameter("operation");
            switch(operator){
                case "+":
                    answer = Integer.toString(first+second);
                    break;
                case "-":
                    answer = Integer.toString(first-second);
                    break;
                case "*":
                    answer = Integer.toString(first*second);
                    break;
                case "%":
                    answer = Integer.toString(first%second);
                    break;
            }
            
            request.setAttribute("answer", answer);
            request.setAttribute("secondIn", second);
            request.setAttribute("firstIn", first);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
            
        } catch (Exception e){
            answer = "invalid";
            request.setAttribute("answer", answer);
            request.setAttribute("secondIn", request.getParameter("secondIn"));
            request.setAttribute("firstIn", request.getParameter("firstIn"));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
    }
}
