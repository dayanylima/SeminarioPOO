package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
public class Separador extends Expression {

    @Override
    public void avaliar(Context context) {

        String expressao = context.getExpressao();

        context.setExpressao(expressao.replace(" ", "-"));
    }

}
