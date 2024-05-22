

<h1 style="text-align:center">Classes e Interfaces</h1>

## Observações

Tentei seguir ao máximo o que foi proposto.

## Resolução

- [Exercício 1](src/ex1)
- [Exercício 2](src/ex2)
- [Exercício 3](src/ex3)
- [Exercício 4](src/ex4)
- [Exercício 5](src/ex5)
- [Exercício 6](src/ex6)
- [Exercício 7](src/ex7)
- [Exercício 8](src/ex8)
- [Exercício 9](src/ex9)
- [Exercício 10](src/ex10)
- [Exercício 11](src/ex11)

## Exercício Proposto

### Interfaces e Classes

### Objetivo:
Implementar interfaces e classes em Java para demonstrar conceitos de orientação a objetos como abstração, polimorfismo e encapsulamento.

### Descrição:
Crie as seguintes classes e interfaces:

1. **Classe ConversorMoeda**:
    - Implementa a interface `ConversaoFinanceira`.
    - Contém o método `converterDolarParaReal(double valorDolar)` para converter um valor em dólar para real.
    - O método deve receber o valor em dólar como parâmetro e utilizar a taxa de câmbio atual para realizar a conversão.

2. **Classe CalculadoraSalaRetangular**:
    - Implementa a interface `CalculoGeometrico`.
    - Contém os métodos:
        - `calcularArea(double altura, double largura)` para calcular a área de uma sala retangular.
        - `calcularPerimetro(double altura, double largura)` para calcular o perímetro de uma sala retangular.

3. **Classe TabuadaMultiplicacao**:
    - Implementa a interface `Tabuada`.
    - Contém o método `mostrarTabuada(int numero)` para exibir a tabuada de um número.
    - O método deve mostrar a tabuada do número de 1 a 10.

4. **Interface ConversorTemperatura**:
    - Define os métodos:
        - `celsiusParaFahrenheit(double celsius)` para converter Celsius para Fahrenheit.
        - `fahrenheitParaCelsius(double fahrenheit)` para converter Fahrenheit para Celsius.

5. **Classe ConversorTemperaturaPadrao**:
    - Implementa a interface `ConversorTemperatura`.
    - Fornece as implementações para os métodos de conversão de temperatura utilizando as fórmulas padrão.

6. **Interface Calculavel**:
    - Define o método `calcularPrecoFinal()` para calcular o preço final de um produto ou serviço.

7. **Classe Livro** (Implementa `Calculavel`):
    - Representa um livro com atributos como preço base e desconto.
    - Implementa o método `calcularPrecoFinal()` para calcular o preço final do livro considerando o desconto.

8. **Classe ProdutoFisico** (Implementa `Calculavel`):
    - Representa um produto físico com atributos como preço base, custo de envio e taxa de imposto.
    - Implementa o método `calcularPrecoFinal()` para calcular o preço final do produto físico considerando envio e imposto.

9. **Interface Vendavel**:
    - Define os métodos:
        - `calcularPrecoTotal(int quantidade)` para calcular o preço total de um produto ou serviço com base na quantidade.
        - `aplicarDesconto(double desconto)` para aplicar um desconto no preço total.

10. **Classe Produto** (Implementa `Vendavel`):
    - Representa um produto com atributos como preço unitário e quantidade em estoque.
    - Implementa os métodos da interface `Vendavel`:
        - `calcularPrecoTotal(int quantidade)` verifica se a quantidade está disponível em estoque e retorna o preço total.
        - `aplicarDesconto(double desconto)` aplica o desconto no preço unitário.

11. **Classe Servico** (Implementa `Vendavel`):
    - Representa um serviço com atributos como preço por hora e horas de trabalho.
    - Implementa os métodos da interface `Vendavel`:
        - `calcularPrecoTotal(int quantidade)` calcula o preço total com base nas horas de trabalho.
        - `aplicarDesconto(double desconto)` aplica o desconto no preço por hora.

### Orientações:
- Utilize os princípios da orientação a objetos para projetar as classes e interfaces.
- Siga as boas práticas de codificação em Java.
- Teste as classes e interfaces criadas para garantir seu funcionamento correto.

### Observações:
- A implementação dos métodos de conversão de temperatura pode ser simplificada utilizando bibliotecas ou APIs disponíveis.
- As classes `Produto` e `Servico` podem ser abstraídas para classes mais específicas, como `Livro`, `Eletronico`, `Consultoria`, `Reparo`, etc.
- O exercício pode ser expandido para incluir outros métodos e funcionalidades nas classes e interfaces.