package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
import java.time.LocalDateTime;

public class Context {

    public String expressao;
    private LocalDateTime data;

    public Context(LocalDateTime data) {
        this.data = data;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    String setExpressao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
