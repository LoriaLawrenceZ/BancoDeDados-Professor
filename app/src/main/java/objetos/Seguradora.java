package objetos;

import exceptions.CnpjDeTamanhoInvalidoException;

public class Seguradora {

    private int id;
    private String nome;
    private String cnpj;
    private String email;
    private Double valor;
    private int id_municipio;
    private int id_estado;

    public Seguradora(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        try {
//            if (cnpj != null) {
//                if (cnpj.length() == 14) {
//                    if (cnpj.matches("[0-9]+")) {
//                        this.cnpj = cnpj;
//                    } else {
//                        throw new RuntimeException("CNPJ não contem apenas numeros!");
//                    }
//                } else {
//                    throw new CnpjDeTamanhoInvalidoException("CNPJ não contem 14 caracteres!");
//                }
//            } else {
//                throw new NullPointerException("CNPJ é NULO!");
//            }

            if (cnpj == null) {
                throw new NullPointerException("CNPJ é NULO!");
            }

            if (cnpj.length() != 14) {
                throw new CnpjDeTamanhoInvalidoException("CNPJ não contem 14 caracteres!");
            }

            if (!cnpj.matches("[0-9]+")) {
                throw new RuntimeException("CNPJ não contem apenas numeros!");
            }

            this.cnpj = cnpj;
        } catch (RuntimeException runtime) {
            throw new RuntimeException("Erro ao realizar a funcão!", runtime);
        } catch (Exception ex) {
            throw new RuntimeException("Erro não tratado!");
        }
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the id_municipio
     */
    public int getId_municipio() {
        return id_municipio;
    }

    /**
     * @param id_municipio the id_municipio to set
     */
    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    /**
     * @return the id_estado
     */
    public int getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String testeException() throws Exception {
        try {
            return "TESTE";
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public String toString() {
        return "Seguradora {" + "id =" + id + ", nome =" + nome + ", cnpj =" + cnpj + '}';
    }
    
}
