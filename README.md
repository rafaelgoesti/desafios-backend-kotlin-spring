# 📦 Organização do Projeto — Desafios com Kotlin + Spring Boot

Este repositório contém uma série de desafios práticos para aprender e testar habilidades com Kotlin e Spring Boot. Abaixo estão as instruções para contribuir, manter organização e versionamento de forma profissional. 🚀

---

## 🧱 Estrutura Recomendada

Cada desafio deve ser desenvolvido de forma isolada para manter o controle e facilitar revisões.

### 🌿 Criação de Branchs

Crie uma branch específica para **cada desafio** usando a convenção:


#### Exemplos:
- `feat/desafio-1-crud-usuarios`
- `feat/desafio-2-jwt-auth`
- `feat/desafio-3-relacionamento-posts`

---

## ✅ Commits Semânticos

Utilize mensagens de commit claras e semânticas para cada ação:

| Tipo     | Uso                                     |
|----------|-----------------------------------------|
| `feat:`  | Nova funcionalidade                     |
| `fix:`   | Correção de bug                         |
| `refactor:` | Refatoração de código                 |
| `test:`  | Adição ou melhoria de testes            |
| `docs:`  | Atualizações na documentação            |
| `chore:` | Tarefas que não alteram o código fonte  |

#### Exemplos:
```bash
git commit -m "feat: implementar endpoint POST /users"
git commit -m "fix: corrigir validação de e-mail"
git commit -m "test: adicionar testes para autenticação JWT"
```
# Guia Rápido de Comandos Git e GitHub

## 📦 Configuração inicial

Configure seu usuário e email para o Git:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```

## 📁 Inicializar repositório

Inicia um repositório Git local na pasta atual:

```bash
git init
```

## 📄 Adicionar arquivos

Adicionar arquivos para a área de staging (pré-commit):

```bash
git add arquivo.txt        # adiciona 1 arquivo específico
git add .                  # adiciona todos os arquivos modificados
```

## ✅ Fazer commit

Registra as alterações no repositório local:

```bash
git commit -m "Mensagem do commit"
```

## 🔍 Ver status

Verifica o status dos arquivos (modificados, staged, etc):

```bash
git status
```

## 📜 Ver histórico

Exibe o histórico de commits:

```bash
git log                   # detalhado
git log --oneline         # resumo em uma linha por commit
```

## 🔄 Clonar repositório (GitHub → local)

Baixa uma cópia de um repositório remoto:

```bash
git clone https://github.com/usuario/repositorio.git
```

## 🔗 Conectar ao GitHub (após git init)

Conecta o repositório local ao remoto no GitHub:

```bash
git remote add origin https://github.com/usuario/repositorio.git
```

## ⬆️ Enviar para o GitHub

Envia as alterações locais para o repositório remoto:

```bash
git push -u origin main    # primeira vez (define upstream)
git push                   # próximas vezes
```

## ⬇️ Atualizar do GitHub (puxar alterações)

Puxa as alterações do repositório remoto para o local:

```bash
git pull
```

## 🌿 Branches

Gerenciamento de branches:

```bash
git branch                 # lista branches locais
git branch nome-da-branch  # cria uma nova branch
git checkout nome-da-branch  # muda para a branch
git checkout -b nova-branch  # cria e muda para nova branch
```

## 🔀 Merge (unir branches)

Une alterações de uma branch em outra:

```bash
git checkout main
git merge nome-da-branch
```

## 🗑️ Remover arquivos

Remove arquivos do repositório e do disco:

```bash
git rm arquivo.txt
```

## 🛑 Desfazer alterações

Desfaz alterações feitas:

```bash
git restore arquivo.txt          # desfaz alterações não commitadas de um arquivo
git reset --hard HEAD            # desfaz todas as alterações não commitadas
git reset --soft HEAD~1          # desfaz o último commit, mantém alterações staged
```

## 🔐 Autenticação GitHub (token)

Use token pessoal no lugar da senha ao usar HTTPS no push/pull.

---
