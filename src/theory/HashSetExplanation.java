package theory;

@SuppressWarnings("ALL")
public class HashSetExplanation {

    /*
    *
    * Explicação resumida no fórum sobre HashSet (analogia dos baldes)
    *
    * O hashCode é utilizado em coleções que usam código hash, como é o caso do HashSet.
    * Se uma coleção não usa hash, apenas o equals entrega a consistência desejada, porém,
    * para manter a consistência com o hashCode, onde dois objetos iguais precisam ter o mesmo hashCode,
    * é importante sempre sobrescrever tanto o equals como o hashCode, nunca apenas um ou outro.
    * Em uma coleção que se usa código hash, é importante primeiro determinar em que “região“ o objeto está.
    * Essa “região“ é um espaço dentro da coleção onde os objetos ficam agrupados por semelhança, facilitando assim os encontrar.
    * E essa é a mesma ideia dos códigos hash. Criar um código que agrupe objetos semelhantes.
    * Com coleções que usam hash, temos que primeiro determinar o código hash e então olhar os objetos dentro do “balde” com o método equals.
    * Pode ser também que, no meio de uma implementação, você altere uma coleção de lista para conjunto,
    * e se o método hashCode não tiver sido sobrescrito, certamente irá gerar uma grande dor de cabeça.
    * Então por essas e outras, sempre utilize os dois: equals e hashCode,
    * pois se algum deles não for utilizado em determinada coleção, ao menos não irá gerar inconsistências,
    * se implementados corretamente!
     * */
}
