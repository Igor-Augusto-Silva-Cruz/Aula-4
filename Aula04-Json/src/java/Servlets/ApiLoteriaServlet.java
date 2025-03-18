package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet(name = "ApiLoteriaServlet", urlPatterns = {"/loteria.json"})
public class ApiLoteriaServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            JSONObject obj = new JSONObject();
            obj.put("datetime", new Date().toString()); // Salva a data e hora

            // Gerar 6 números aleatórios únicos entre 1 e 90
            Set<Integer> numerosGerados = new HashSet<>();
            Random random = new Random();
            while (numerosGerados.size() < 6) {
                numerosGerados.add(random.nextInt(99) + 1);
            }

            
            JSONArray numerosArray = new JSONArray(numerosGerados);
            obj.put("numeros", numerosArray);

           
            out.println(obj.toString(4));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  

    
}
