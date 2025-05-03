# 📋 Task Manager App

Ce projet est une application de gestion de tâches (CRUD) développée avec Angular (frontend), Spring Boot (backend) et MySQL (base de données).

## 📌 Technologies utilisées

* 🎨 **Frontend** : Angular 19
* 💠 **Backend** : Spring Boot 3
* 📂 **Base de données** : MySQL
* 🔐 Authentification simple (sans JWT)

---

## 🚀 Fonctionnalités

* Création, édition, suppression et affichage de tâches
* Priorisation et description des tâches
* Authentification utilisateur : inscription et connexion
* Interface utilisateur simple et responsive

---

## 🧩 Structure du projet

```
task-manager/
├── task-backend/      # Projet Spring Boot (API REST)
├── task-frontend/     # Projet Angular
lien disponible ici
https://github.com/Abdoulaye12/crud-angular-front.git
└── README.md
```

---

## 💽 Installation

### ⚙️ Prérequis

* Node.js et npm
* Angular CLI
* Java 17+
* MySQL
* Git

---

### 🧪 Étapes pour exécuter l'application

#### 🔽 1. Cloner le dépôt

```bash
git clone https://github.com/ton-utilisateur/task-manager.git
cd task-manager
```

#### 📃 2. Configurer MySQL

Crée une base de données :

```sql
CREATE DATABASE taskdb;
```

Et configure ton fichier `application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=ton_utilisateur_mysql
spring.datasource.password=ton_mot_de_passe
spring.jpa.hibernate.ddl-auto=update
```

---

#### ⚖️ 3. Lancer le backend

```bash
cd task-backend
./mvnw spring-boot:run
```

> Le backend tourne sur `http://localhost:8080`

---

#### 🌐 4. Lancer le frontend

```bash
cd ../task-frontend
npm install
ng serve
```

> Le frontend sera accessible à `http://localhost:4200`

---

## 📝 Utilisation

* 🧑‍💼 Accéder à la page d’inscription via `/register`
* 🔐 Se connecter via `/login`
* ✅ Une fois connecté, gérer vos tâches sur `/tasks`

---

## ❓ Problèmes courants

* **Erreur 200 unknown JSON** : ton backend doit retourner des réponses en format JSON
* **Erreur 400/403** : vérifie les routes côté Spring ou la configuration CORS

---

## 👨‍💼 Auteur

* Développé par \Abdoulaye Gaye
* \ablayegaye207@gmail.com

---

## ⚖️ Licence

Ce projet est sous licence MIT – utilisez-le comme vous voulez !
