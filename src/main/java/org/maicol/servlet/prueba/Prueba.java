package org.maicol.servlet.prueba;

/*Nombre del programador: Michael Guaman
Materia: Lenguajes de Programacion 2
Fecha: 20/05/2024
Detalle:Prueba sobre el metodo factorial
Version:1.1.0*/

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class Prueba extends HttpServlet {

    //utilizamos el metodo post que permite enviar los datos al servidor
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        //declaramos ls variable num que permitira ingresar el numero
        // pero lo tenemos que transformar a entero
        int num = Integer.parseInt(request.getParameter("num"));

        // mostramos el resultado utilziando la funcion factorial conjuntamente con el numero ingresado
        int resultado = factorial(num);

        PrintWriter out = response.getWriter();

        //colocamos la estructura del html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Factorial</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado del factorial</h1>");
        //colocamos un mensaje que permita mostrar el numero ingresado y el resultado es decir su factorial
        out.println("<h3> El factorial de "+ num +" es: " + resultado + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }

    //mendiate esta funcion factorial realizamos el claculo del numero
    //mediante un bucle for realizmos el calculo del factorial
    private int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
