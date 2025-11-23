package br.com.hub.model;

public class Cadastro {

    private String nomeCompleto;
    private Integer idade;
    private String formacao;
    private String profissao;
    private String areasInteresse;
    private String cep;
    private String email;
    private String telefone;
    private String expectativaHub;

    public Cadastro() {
    }

    public Cadastro(String nomeCompleto, Integer idade, String formacao, String profissao,
                    String areasInteresse, String cep, String email, String telefone,
                    String expectativaHub) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.formacao = formacao;
        this.profissao = profissao;
        this.areasInteresse = areasInteresse;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.expectativaHub = expectativaHub;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getAreasInteresse() {
        return areasInteresse;
    }

    public void setAreasInteresse(String areasInteresse) {
        this.areasInteresse = areasInteresse;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getExpectativaHub() {
        return expectativaHub;
    }

    public void setExpectativaHub(String expectativaHub) {
        this.expectativaHub = expectativaHub;
    }
}
