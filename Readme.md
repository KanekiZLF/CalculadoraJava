# Calculadora em Java

### Calculadora Simples desenvolvida usando Linguagem Java.

Esta é uma calculadora simples criada usando o software NetBeans.

Para mostrar os numeros, preferi usar uma Label, dessa maneira fica mais dinamico e simples.

Para mostrar os numeros digitados, criei uma função chamada digita(); Essa função verifica o numero e coloca ele dentro de uma Label (lValor);

Criei uma função que verifica se o primeiro numero digitado é ZERO 0 ou o segundo, não tem como somar um numero por ZERO 0, dessa maneira ele da uma mensagem
"IMPOSSIVEL", caso esteja tudo OK, ele segue com o calculo e mostra o resultado da soma.

Criei a função limpa(); faz justamente oque diz, toda vez que um OPERADOR é digitado, ela limpa o display e guarda o valor digitado.

A função digitaNum(); verifica o numero digitado e repassa isso para o Label2 (lValor2)

Para deixar com um design mais compativel, utilizei um JAR FlatLaf, disponivel no site <a href="https://search.maven.org/artifact/com.formdev/flatlaf/1.2/jar">FormDev<a/>
Depois defini isso dentro da class Principal.

Para fazer os calculos, utilizei um switch para verificar os operadores e seguir com a ação.

# FINISH
