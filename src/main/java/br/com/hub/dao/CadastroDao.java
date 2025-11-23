package br.com.hub.dao;

import br.com.hub.model.Cadastro;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;

@ApplicationScoped
public class CadastroDao {

    @Inject
    DataSource dataSource;

    public void cadastrar(Cadastro cadastro) throws SQLException {
        try (Connection conexao = dataSource.getConnection()) {

            PreparedStatement stmt = conexao.prepareStatement(
                    "INSERT INTO TB_PERFIL_IMPACTA (" +
                            "NOME_COMPLETO, IDADE, FORMACAO, PROFISSAO, AREAS_INTERESSE, CEP, EMAIL, TELEFONE, EXPECTATIVA_HUB" +
                            ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );

            setarParametros(cadastro, stmt);
            stmt.executeUpdate();
        }
    }

    private void setarParametros(Cadastro cadastro, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, cadastro.getNomeCompleto());
        stmt.setInt(2, cadastro.getIdade()); // Idade como INT (recomendado)
        stmt.setString(3, cadastro.getFormacao());
        stmt.setString(4, cadastro.getProfissao());
        stmt.setString(5, cadastro.getAreasInteresse());
        stmt.setString(6, cadastro.getCep());
        stmt.setString(7, cadastro.getEmail());
        stmt.setString(8, cadastro.getTelefone());
        stmt.setString(9, cadastro.getExpectativaHub());
    }
}
