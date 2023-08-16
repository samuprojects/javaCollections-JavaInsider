package theory;

@SuppressWarnings("ALL")
public class HashSetExplanation2 {

    /*
    *
    * Sobre a explicação com analogia dos baldes
    *
    * o hashcode só é bom quando faz um bom espalhamento
    * pois do contrario havendo muitos itens num mesmo balde o equals terá de comparar um a um
    * o que diminui a performance.
    *
    * Se o seu algoritmo de hashing não faz um bom espalhamento só terá problemas.
    * Por isso se na maioria das vezes se seu algoritmo retorna sempre um hash diferente para cada objeto diferente
    * significa que terá menos objetos por balde o que garante ao equals uma eficiencia bem maior
    *
    * A recomendação é usar a implementação que o Java sugere para o hash que atende bem as necessidades
    *
    * O único ponto de atenção é para não gerar hash diferentes para objetos iguais
    * SEMPRE DEVE GARANTIR QUE OBJETOS IGUAIS ESTEJAM NO MESMO BALDE, OU SEJA, objetos iguais devem ter o mesmo hash
    * O objetivo de tudo isso é garantir a performance na hora de buscar um objeto
     * */
}
