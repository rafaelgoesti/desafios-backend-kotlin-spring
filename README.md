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
