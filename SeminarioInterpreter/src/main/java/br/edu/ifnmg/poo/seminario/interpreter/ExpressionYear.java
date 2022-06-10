package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
public class ExpressionYear extends Expression {

    @Override
    public void interpret(Context context) {

        String expressao = context.getExpressao();

        Integer ano = context.getData().getYear();

        context.setExpressao(expressao.replace("YYYY", ano.toString()));
    }

}
