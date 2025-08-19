
# Projeto: Monitoramento de Carros 🚗

## Descrição
Este projeto tem como objetivo verificar se um carro está apto para rodar com base no **ano de fabricação** e no **ano atual**.  
Um carro é considerado **Apto** se tiver até 10 anos de uso. Caso contrário, será considerado **Não apto**.

O projeto foi desenvolvido em **Java** aplicando conceitos de **Programação Orientada a Objetos (POO)** e utilização de **métodos estáticos**.

---

## Entrada
A entrada do programa consiste em:
1. **Modelo do carro** (`String`)
2. **Ano de fabricação** (`int`)
3. **Ano atual** (`int`)

---

## Saída
O programa retorna uma mensagem indicando se o carro está **Apto** ou **Não apto** para rodar, no formato:

```
<Modelo>: Apto
```
ou
```
<Modelo>: Nao apto
```

---

## Exemplos

### Exemplo 1
**Entrada:**
```
Civic
2015
2025
```
**Saída:**
```
Civic: Apto
```

### Exemplo 2
**Entrada:**
```
Gol
2012
2025
```
**Saída:**
```
Gol: Nao apto
```

### Exemplo 3
**Entrada:**
```
Corolla
2018
2025
```
**Saída:**
```
Corolla: Apto
```

---

## Tecnologias Utilizadas
- **Java 21+**
- **POO (Programação Orientada a Objetos)**
- **Métodos Estáticos**
- **Scanner (entrada de dados)**

---

## Estrutura do Código

```java
import java.util.Scanner;

public class CarroMonitoramento {

    // Método estático que verifica se o carro está apto
    public static String verificarAptidao(String modelo, int anoFabricacao, int anoAtual) {
        int idade = anoAtual - anoFabricacao;
        if (idade <= 10) {
            return modelo + ": Apto";
        } else {
            return modelo + ": Nao apto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo entradas
        String modelo = scanner.nextLine();
        int anoFabricacao = scanner.nextInt();
        int anoAtual = scanner.nextInt();

        // Chamando método estático
        String resultado = verificarAptidao(modelo, anoFabricacao, anoAtual);

        // Exibindo resultado
        System.out.println(resultado);

        scanner.close();
    }
}
```

---

## Autor
👤 **Jeferson Pinheiro de Jesus**  
🔗 [LinkedIn](https://www.linkedin.com/in/eijeffpinheiro/)
