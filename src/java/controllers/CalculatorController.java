/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.calculators.CircleAreaCalculator;
import models.calculators.RectangleAreaCalculator;
import models.calculators.TriangleSideCalculator;

/**
 *
 * @author Jwilliams96
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/CalculatorController"})
public class CalculatorController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            String typeOfRequest = request.getParameter("type");

            if (typeOfRequest.equalsIgnoreCase("rectangle")) {
                String height = request.getParameter("height");
                String width = request.getParameter("width");

                RectangleAreaCalculator rac = new RectangleAreaCalculator(height, width);

                out.write("Your answer is: " + String.valueOf(rac.getArea()));
            } else if (typeOfRequest.equalsIgnoreCase("circle")) {
                String radius = request.getParameter("radius");

                CircleAreaCalculator circleCalc = new CircleAreaCalculator(radius);

                out.write("Your answer is: " +  String.valueOf(circleCalc.getArea()));
            } else if (typeOfRequest.equalsIgnoreCase("triangleSide")) {
                String sideA = request.getParameter("sideA");
                String sideB = request.getParameter("sideB");

                TriangleSideCalculator triCalc = new TriangleSideCalculator(sideA, sideB);

                out.write("Your answer is: " +  String.valueOf(triCalc.getSide()));
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            out.write(e.getMessage());
            out.flush();
            out.close();
        }
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
