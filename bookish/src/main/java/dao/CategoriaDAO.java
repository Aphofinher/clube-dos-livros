package dao;


import config.ConnectionPoolConfig;
import model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO {


    public boolean inserirCategoria(Categoria Obj) {

        boolean retorno = false;

        Connection conexao = null;

        String SQL = "INSERT INTO categoria SET  id = ?, categoria = ?,";


        try {

            conexao = ConnectionPoolConfig.getConnection();

            PreparedStatement comandoSQL
                    = conexao.prepareStatement(SQL);

            comandoSQL.setInt(1, Obj.getId());
            comandoSQL.setString(2, Obj.getCategoria());



            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                retorno = true;

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return retorno;

    }

    public ArrayList<Categoria> listarCategoria() {

        ArrayList<Categoria> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {

            conexao = ConnectionPoolConfig.getConnection();

            // Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("SELECT * FROM CATEGORIA");

            // Passo 4 - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    Categoria obj = new Categoria();

                    obj.setCategoria(rs.getString("NOME_CATEGORIA"));
                    obj.setId(rs.getInt("ID"));


                    listaRetorno.add(obj);

                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return listaRetorno;
    }


    public boolean alterarCategoria(Categoria Obj) {

        boolean retorno = false;

        Connection conexao = null;

        String SQL = "UPDATE categoria SET id = ?, categoria = ?,"
                + " WHERE categoria = ?";


        try {

            conexao = ConnectionPoolConfig.getConnection();

            PreparedStatement comandoSQL
                    = conexao.prepareStatement(SQL);


            comandoSQL.setInt(1, Obj.getId());
            comandoSQL.setString(2, Obj.getCategoria());



            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                retorno = true;

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return retorno;

    }

    public boolean excluirCategoria(int id) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            conexao = ConnectionPoolConfig.getConnection();

            PreparedStatement comandoSQL
                    = conexao.prepareStatement("DELETE FROM categoria WHERE id = ?");

            comandoSQL.setInt(1, id);


            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                retorno = true;

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return retorno;
    }


}
