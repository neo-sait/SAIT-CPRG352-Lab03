
package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author neo
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       
        return; 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ageIn = request.getParameter("ageInput");
        request.setAttribute("ageInput", ageIn);
        
        String message;
        
        try{
            int ageNext = Integer.parseInt(ageIn)+1;
            if (ageIn == null || ageIn.equals("")){
                
                message = "You must give your current age.";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }else{
                
            
            message = "Your age next birthday will be "+ ageNext+".";
            request.setAttribute("message", message);
           
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;   
            }
            
            
            
            
        } catch (Exception e){
            
        
                message = "You must enter a number.";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            
        }
                
    }
    
    
}
