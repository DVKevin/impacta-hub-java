package br.com.hub.dto.perfil;


public class DetalhesPerfilDto {

    private int idPerfil;
    private String nomeCompleto;
    private int idade;
    private String formacao;
    private String profissao;
    private String areasInteresse;
    private String cep;
    private String email;
    private String telefone;
    private String expectativaHub;

    // Getters e Setters
    public int getIdPerfil() { return idPerfil; }
    public void setIdPerfil(int idPerfil) { this.idPerfil = idPerfil; }

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

