# ✂️ BarberPro – Sistema de Agendamento para Barbearias

Sistema completo para gestão de barbearias, desenvolvido com Spring Boot no backend e React no frontend. Idealizado como vitrine acadêmica e profissional para destacar habilidades modernas de autenticação com JWT, estrutura RESTful, interface responsiva, documentação de API e deploy em nuvem.

---

## 🚀 Funcionalidades

- Autenticação com e-mail e senha (JWT)
- Cadastro de clientes, barbeiros e serviços
- Painel administrativo com métricas e dashboard
- Agendamento de horários por profissional e serviço
- Tela de login, cadastro e painel com rotas protegidas
- Interface moderna com Tailwind CSS + React
- Banco de dados PostgreSQL
- Documentação da API com Swagger
- Deploy completo (Railway + Vercel)

---

## 🛠️ Tecnologias Utilizadas

### Backend:
- Java 17
- Spring Boot 3.x
- Spring Security + JWT (java-jwt)
- Spring Data JPA
- PostgreSQL
- Springdoc OpenAPI

### Frontend:
- React + Vite
- Tailwind CSS
- Axios
- React Router
- Context API

---

## 📁 Organização do Projeto
barberpro/ ├── backend/ │   ├── controller/ │   ├── service/ │   ├── entity/ │   ├── repository/ │   ├── security/ │   └── config/ ├── frontend/ │   ├── src/components/ │   ├── src/pages/ │   ├── src/services/ │   ├── src/routes/ │   └── src/context/

---

## 📷 Demonstração

![Dashboard Admin](./screenshot-dashboard.png)  
*Interface com cards de métricas, calendário e painel de serviços.*

---

## 📚 Como rodar localmente

```bash
# Clonar o repositório
git clone https://github.com/Robertoursine/barberpro.git

# Backend
cd barberpro/backend
./mvnw spring-boot:run

# Frontend
cd barberpro/frontend
npm install
npm run dev
💼 Objetivo acadêmico
Este projeto foi criado como material de estudo e desenvolvimento completo de uma aplicação realista com foco em arquitetura, segurança e experiência do usuário, representando um cenário de produção usado por empresas do setor.

📄 Licença
MIT License – Sinta-se à vontade para usar e adaptar este projeto para estudos, portfólio ou expansão profissional.

---

Assim que colar e salvar, execute no terminal:

```bash
git add README.md
git commit -m "Adiciona README com descrição e funcionalidades"
git push origin main

