package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
public class Separador extends Expression {

    @Override
    public void interpret(Context context) {

        String expressao = context.getExpressao();

        context.setExpressao(expressao.replace(" ", "-"));
    }

}
