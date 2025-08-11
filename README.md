-- AULA 08/08 --

S O L I D

L -> princípio de substituição de Liskov
Uma classe Animal e duas subclasses, Cachorro e Gato. O Princípio de Liskov diz que você deve ser capaz de usar Cachorro ou Gato no lugar de Animal sem causar problemas no sistema!Sem necessidade de tratamento especial para as subclasses.

assinatura da classe (estrutura herdada)-> exposição do que a classe que herda tem para utilizar (herança);

-> Sobescrita de método - preserva assinatura e altera a implementação -- 
    override -> mantenho o que já existe, e add novas implementações --> sobrecarga 
    sobreposição total da implementação anterior (visualizar o ps1)

-> Construtores:
1. modificador de acesso + nome da classe + corpo do método
ex: public professor (String cpf, String nome, String email, String matricula)...

Polimorfismo 
1. sobrecarga -> mesmo nome do método, mas com assinatura diferente (parâmetros diferentes) -> não necessariamente somente no construtor como especificado em aulas, mas pode ser nos métodos tb (ex do salvar na aula de 08/08) 
ex: professor () -> sem parâmetros
    professor (String cpf, String nome, String email, String matricula);

ex2: o pedágio tem: cancela.cobrar (moto, carro, onibus)
    mas pode ter somente cobrar (moto), ou cobrar (onibus)

----------------------------------

Ps:
1 -> 0 que acontece se eu fizer uma sobescrita de método na classe que foi herdada, e esse método contradiz o método que está na classe que herda? existe prioridade para inicialização?
R: se uma classe filha sobrescreve um método da classe pai usando override, a implementação da classe filha é a que será executada. o último que sobrescreve é quem vale na execução!

**Então por que usar o override? -> manter a mesma interface, manter o polimorfismo e\ou especializar um comportamento genérico (ex: animal faz barulho e cachorro late)
Se o método representa a mesma ação, mas com implementação diferente → use herança + override.
Se é uma ação diferente, mesmo que pareça parecida, crie um método novo.

2 -> 