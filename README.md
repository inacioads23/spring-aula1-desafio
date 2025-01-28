# Projeto Desafio Aula1

## DESAFIO: Componentes e injeção de dependência

Criar um sistema para calcular o **valor total** de um pedido, considerando uma porcentagem de desconto e o frete. O cálculo do **valor total** do pedido consiste em aplicar o desconto ao **valor básico** do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

![Image 1](src/main/resources/image/image1.jpg)

![Image 2](src/main/resources/image/image2.jpg)

![Image 3](src/main/resources/image/image3.jpg)

![Image 4](src/main/resources/image/image4.jpg)


A solução deverá seguir as seguintes especificações:

Um pedido deve ser representado por um objeto conforme projeto abaixo:<br/>
![Image 5](src/main/resources/image/image5.jpg)

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade, conforme projeto abaixo:<br/>
![Image 5](src/main/resources/image/image6.jpg)

Serviço OrderService: responsável por operações referentes a pedidos.<br/>
Serviço ShippingService: responsável por operações referentes a frete.<br/>

Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com @Service.
