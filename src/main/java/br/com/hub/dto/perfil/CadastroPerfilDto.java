package br.com.hub.dto.perfil;


import jakarta.validation.constraints.*;

public class CadastroPerfilDto {

    @NotBlank(message = "Nome completo é obrigatório")
    @Size(max = 150)
    private String nomeCompleto;

    @Positive(message = "A idade deve ser um número positivo")
    @Max(120)
    private int idade;

    @Size(max = 150)
    private String formacao;

    @Size(max = 150)
    private String profissao;

    @Size(max = 300)
    private String areasInteresse;

    @Size(max = 15)
    private String cep;

    @Email(message = "Formato de e-mail inválido")
    @Size(max = 150)
    private String email;

    @Size(max = 20)
    private String telefone;

    @Size(max = 500)
    private String expectativaHub;

    // Getters e Setters
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getFormacao() { return formacao; }
    public void setFormacao(String formacao) { this.formacao = formacao; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    public String getAreasInteresse() { return areasInteresse; }
    public void setAreasInteresse(String areasInteresse) { this.areasInteresse = areasInteresse; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getExpectativaHub() { return expectativaHub; }
    public void setExpectativaHub(String expectativaHub) { this.expectativaHub = expectativaHub; }
}

