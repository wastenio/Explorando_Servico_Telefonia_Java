# Desafio: Verificação de Serviços Contratados pela Concessionária de Telecomunicações

## Descrição do Desafio

Este desafio tem como objetivo desenvolver um programa para uma concessionária de telecomunicações que oferece quatro tipos de serviços:
- Telefonia Móvel
- Telefonia Fixa
- Banda Larga
- TV por Assinatura

O sistema deve permitir que, ao receber o nome de um serviço, seja possível verificar se um cliente contratou ou não aquele serviço específico. O cliente pode contratar qualquer combinação desses serviços, e o sistema precisa identificar rapidamente se o serviço mencionado está entre os contratados.

### Entrada
O programa recebe duas linhas de entrada:
1. **A primeira linha** contém o nome do serviço a ser verificado (exemplo: "movel", "fixa", "banda larga", "tv").
2. **A segunda linha** contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (exemplo: "Alice,movel,fixa").

### Saída
A saída deve ser:
- **"Sim"** se o cliente contratou o serviço especificado.
- **"Nao"** caso o cliente não tenha contratado o serviço.

### Exemplos de Entrada e Saída

#### Exemplo 1:

**Entrada:**

    - movel: Alice,movel,fixa


**Saída:**

    - Sim


#### Exemplo 2:

**Entrada:**

    - fixa: Bob,movel,tv


**Saída:**

    - Nao


---
