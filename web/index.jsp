<%-- 
    Document   : index
    Created on : Feb 5, 2013, 12:24:31 PM
    Author     : Jwilliams96
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="masterpage.css">
    </head>
    <body>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js" 
        type="text/javascript"></script>
        
        <script type="text/javascript" src="formValidation.js"></script>
        <%Object obj = request.getAttribute("answer");
            String answer = "";
            double type = 0;
            if (obj != null) {
                answer = "Answer: " + obj.toString();
            }
            obj = request.getAttribute("typeOfAnswer");

            try {
                type = Double.valueOf(obj.toString());
            } catch (Exception e) {
            }
        %>
        <div style="height:100%;width:100%;position: absolute; top: 0; left: 0;">
            <form id="rectangleAreaCalculator" method="POST"  class="calculator"
                  action="CalculatorController?type=rectangle"
                  onsubmit='return checkForms("rectangle")'>
                
                <h2>Rectangle Area Calculator</h2>
                <p>Width:   </p><input name="width" type="number" step="any" id="txtWidth" required="true"/><br/>
                <p>Height:   </p><input name="height" type="number" step="any" id="txtHeight" required="true"/><br/>
                <input type="submit" id="rectangleSubmit"/>
                <br/>
                <p><%
                    if (type == 1) {
                        out.write(answer);
                    }
                    %>
                </p>
            </form>
            <form id="circleAreaCalculator" method="POST"  class="calculator" 
                  action="CalculatorController?type=circle"
                  onsubmit='return checkForms("circle")'>
                <h2>Circle Area Calculator</h2>
                <p>Radius:   </p><input id="txtRadius" name="radius" type="number" step="any" required="true"/><br/>
                <input type="submit" id="circleSubmit"/>
                <br/>
                <p><%
                    if (type == 2) {
                        out.write(answer);
                    }
                    %></p>
            </form>
            <form id="triangleSideCalculator" method="POST" class="calculator" 
                  action="CalculatorController?type=triangleSide"
                  onsubmit='return checkForms("triangleSide")'>
                <h2>Triangle Side Calculator</h2>
                <p>Side A:   </p><input id="txtSideA" name="sideA" type="number" step="any" required="true"/><br/>
                <p>Side B:   </p><input id="txtSideB" name="sideB" type="number" step="any" required="true"/><br/>
                <input type="submit" id="triangleSubmit"/>
                <br/>
                <p><%
                    if (type == 3) {
                        out.write(answer);
                    }
                    %></p>
            </form>
        </div>
    </body>
</html>
