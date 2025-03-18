/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author igora
 */
@WebServlet(name = "Api_igor_augusto_Servlet", urlPatterns = {"/igoraugusto.json"})
public class Api_igor_augusto_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
         
            
            long RA = 1290482322041L;
            out.println(" RA: "+RA );
            String Nome = "Igor augusto da silva cruz";
             out.println(" Nome: "+Nome );
            
             JSONArray Disciplinas = new JSONArray();
            Disciplinas.put("Banco de Dados");
            Disciplinas.put("Engenharia de Software III");
            Disciplinas.put("Programação Orientada a Objetos");
            Disciplinas.put("Linguagem de Programação IV - INTERNET");
            Disciplinas.put("Sistemas Operacionais II");
            Disciplinas.put("Inglês III");
            Disciplinas.put("Inglês IV");
            Disciplinas.put("Metodologia da Pesquisa Científico-Tecnológica");
            
            for (int i = Disciplinas.length() - 1; i >= 0; i--) {
                 out.println(" Disciplinas: " + Disciplinas.get(i));
}
            
             

             
             
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
