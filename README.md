<h1 align="center">Sistema de Consultas Médicas</h1>

# Sumário

# 1. Sobre o Projeto

# 2. Ferramentas Utilizadas

# 3. Funcionamento
## 3.1. GUI
Para a construção da interface gráfica foi utilizado a biblioteca ``Java Swing``.
```java
    import javax.swing.*;
```
### 3.1.1. Tela Principal
Para a tela principal é necessário a importação de componentes extras
```java
    import javax.swing.*;
    import javax.swing.border.EmptyBorder;

    import java.awt.*;
```

A classe ``TelaPrincipal`` é utilizada para a construção da tela inicial da interface gráfica, herdando atributos e métodos da classe ``JFrame`` 


```java
    private JButton botaoCadastrarPaciente;
    private JButton botaoCriarConsulta;
    private JButton botaoVerificarPaciente;
    private JButton botaoVerificarConsulta;
```
# Requisitos do Sistema

[ ] CRUD de registros

[ ] Herança

[ ] Polimorfismo

[ ] GUI Swing

[ ] Documentação do programa

[ ] Collections

[ ] Leitura e Escrita de arquivos

# Guia de Comandos Git

## Clonar Repositósio

```
    git clone <URLDoRepositorio>
```

## Controle de versão

Verificando alterações do repositório remoto:
```
    git pull
```

Adicionando um arquivo específico ao stage:
```
    git add <nomeDoArquivo>
```

Adicionando todos os arquivos modificados ao stage:
```
    git add .
```

Resgistrando um commit com mensagem:
```
    git commit -m "mensagem do commit"
```

Enviando commit para o repositório remoto:
```
    git push
```

## Branches

Listando branches criadas:
```
    git branch
```

Criando uma nova branch:
```
    git branch <nomeDaBranch>
```

Mudando para uma outra branch:
```
    git checkout <nomeDaBranch>
```

Criando e mudando para a branch criada:
```
    git checkout -b <nomeDaBranch>
```

Deletando uma branch local:
```
    git branch -d <nome-da-branch>
```

Forçando a deleção de uma branch:
```
    git branch -D <nome-da-branch>
```

## Merge
Fazendo merge de uma branch na branch atual.
```
    git merge <nome-da-branch>
```

## Repositório remoto

Enviando a branch para o repositório remoto:
```
    git push -u origin <nomeDaBranch>
```

Atualizando o repositório local:
```
    git pull origin <nomeDaBranch>
```

Atualizando repositórios remoto no local
```
    git fetch
```