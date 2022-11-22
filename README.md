# api-spring-boot

### Lancement image Docker MariaDB

Installer la dernière version de Docker desktop

Lancer le container MariaDB local:

```
docker compose -f ./docker/mariadb.yml up -d
```

Pour se connecter à MariaDB (afin de vérifier la connexion):

```
docker exec -it api-mariadb mysql -u root -p
```

### Initialisation de la base et des données test

```
ce connecter à la base de données via PhpMyAdmin
- localhost:8088 (root:root)
- copier le script 'data-init.sql' (racine du projet BACK) et l'éxecuter
```

