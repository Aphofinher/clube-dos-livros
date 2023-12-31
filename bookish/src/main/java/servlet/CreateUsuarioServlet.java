package servlet;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/create-usuario")

public class CreateUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String usuarioNome = req.getParameter("nome");
        String usuarioEmail = req.getParameter("email");
        String usuarioSenha = req.getParameter("senha");
        String confirmaSenha = req.getParameter("confirmaSenha");
        String redeSocial = req.getParameter("rede-social");


        Usuario usuario = new Usuario(usuarioNome, usuarioEmail, usuarioSenha,redeSocial);

        boolean isCadastrado = new UsuarioDAO().primeiroCadastroUsuario(usuario);

        if(usuarioSenha.equals(confirmaSenha)){

        if (isCadastrado) {

            req.setAttribute("cadastrado", "Cadastro realizado com sucesso!");

            req.getRequestDispatcher("login/login.jsp").forward(req, resp);

        } else {


            req.setAttribute("erroCadastro", "Email já cadastrado!");

            req.getRequestDispatcher("cadastro/cadastro.jsp").forward(req, resp);


        }} else {

            req.setAttribute("erroCadastro", "As senhas não coincidem!");

            req.getRequestDispatcher("cadastro/cadastro.jsp");


        }


    }

}
