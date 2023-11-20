package servlet;

import dao.ComentarioDAO;
import model.Comentario;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/retornar-comentario")

public class RetornaComentárioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String email = req.getParameter("email");
        String categoria = req.getParameter("categoria");

        List<Comentario> comentario = new ComentarioDAO().listarComentario(email, categoria);

        req.setAttribute("comentario", comentario);


    }
}

