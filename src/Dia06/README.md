# Dia06 - Introdução orientação a objetos;

<ol>
    <li>Carro
        <ul>
            <li>Atributos: Quilometragem, capacidade do tanque (deve ser informado na instância do objeto) e quantidade de combustível;</li>
            <li>Métodos: <em>desclocar</em> (deve ser informado a distância e não deve descolocar sem gasolina), <em>abastecer</em> (a gasolina não deve ultrapassar a capacidade máxima do tanque), <em>buscar quilometragem</em> e <em>buscar quantidade de gasolina</em> no tanque;</li>
        </ul>
    </li>
    <li>Porquinho
        <ul>
            <li>Atributos: saldo;</li>
            <li>Métodos: <em>depositar</em> (apenas moedas devem ser permitidas), <em>exibir</em> saldo e <em>quebrar</em> o cofrinho;</li>
        </ul>
    </li>
</ol>

<hr> 
<h3>Exercícios Propostos</h3>

<ol>
    <li>Bola
        <ul>
            <li>Atributos: Cor, circunferência e material.</li>
            <li>Métodos: trocaCor e mostraCor.</li>
        </ul>
    </li>
    <li>Quadrado
        <ul>
            <li>Atributos: Lado</li>
            <li>Métodos: mudarValorLado, retornarValorLado e calcularArea.</li>
        </ul>
    </li>
    <li>Retângulo
        <ul>
            <li>Atributos: Base e altura.</li>
            <li>Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro.</li>
            <li>Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.</li>
        </ul>
    </li>
    <li>Pessoa
        <ul>
            <li>Atributos: Nome, idade, peso e altura.</li>
            <li>Métodos: Envelhecer(cada ano que a pessoa envelhece antes dos 21, ela cresce 0.5cm), emagrecer, engordar e crescer(depois dos 21 não pode crescer).</li>
        </ul>
    </li>
    <li>Conta corrente
        <ul>
            <li>Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios</li>
        </ul>
    </li>
    <li>Classe TV
        <ul>
            <li>Faça um programa que simule um televisor criando-o como um objeto. O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume. Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas</li>
        </ul>
    </li>
    <li>Bomba de combustível
        <ul>
            <li>Atributos: tipoCombustivel, valorLitro e quantidadeCombustivel;</li>
            <li>Métodos: abastecerPorValor(), abastecerPorLitro(), alterarValor(), alterarCombustível(), alterarQuantidadeCombustível</li>
            <li>Obs - A cada abastecimento a quantidade de combustível na bomba deve ser atualizada;</li>
        </ul>
    </li>
    <li>Ponto Retângulo
        <ul>
            <li>Possua uma classe chamada Ponto, com os atributos x e y;</li>
            <li>Possua uma classe chamada Retangulo, com os atributos largura e altura;</li>
            <li>Possua uma função para imprimir os valores da classe Ponto;</li>
            <li>Possua uma função para encontrar o centro de um Retângulo;</li>
            <li>Você deve criar alguns objetos da classe Retangulo;</li>
            <li>Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior esquerdo do retângulo, que deve ser um objeto da classe Ponto;</li>
            <li>A função para encontrar o centro do retângulo deve retornar o valor para um objeto do tipo ponto que indique os valores de x e y para o centro do objeto;</li>
            <li>O valor do centro do objeto deve ser mostrado na tela;</li>
            <li>Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo.</li>
        </ul>
    </li>
    <li>Tamagushi
        <ul>
            <li>Atributos: Nome, Fome, Saúde e Idade;</li>
            <li>Métodos: Alterar Nome, Fome, Saúde e Idade; Retornar Nome, Fome, Saúde e Idade Obs: Existe mais uma informação que devemos levar em consideração, o Humor do nosso tamagushi, este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um campo calculado, então não devemos criar um atributo para armazenar esta informação por que ela pode ser calculada a qualquer momento.</li>
            <li>Melhore o programa do bichinho virtual, permitindo que o usuário especifique quanto de comida ele fornece ao bichinho e por quanto tempo ele brinca com o bichinho. Faça com que estes valores afetem quão rapidamente os níveis de fome e tédio caem.</li>
            <li>Crie uma Fazenda de Bichinhos instanciando vários objetos bichinho e mantendo o controle deles através de uma lista. Imite o funcionamento do programa básico, mas ao invés de exigis que o usuário tome conta de um único bichinho, exija que ele tome conta da fazenda inteira. Cada opção do menu deveria permitir que o usuário executasse uma ação para todos os bichinhos (alimentar todos os bichinhos, brincar com todos os bichinhos, ou ouvir a todos os bichinhos). Para tornar o programa mais interessante, dê para cada bichinho um nivel inicial aleatório de fome e tédio.</li>
        </ul>
    </li>
</ol>