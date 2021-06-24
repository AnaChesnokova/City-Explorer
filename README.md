# Городской проводник
Летняя стажировка Simbirsoft.

### Задание
Описание идеи: 
приложение с информацией для путешественников по России о каждом городе с фото. 
Указаны стоимость проезда по городу, отели/гостиницы с возможностью бронирования, 
карта города и метро, краткое описание достопримечательностей. 
Арендодатели посуточного жилья могут размещать свои объявления. 
Афиша массовых мероприятий. Рейтинг мест питания

[Теническое задание](files/task.docx)

### Tools and Technologies Used
* Java 11
* Maven
* Spring Boot
* Spring Security
* Spring Data JPA
* PostgreSQL 12
* Flyway

### Запуск приложения
Для запуска приложения на локальном хосте необходимо создать базу данных **cityexplorer** (PostgreSQL 12).

Для доступа к базе данных используются параметры по умолчанию: 
имя пользователя ***postgres***, пароль ***postgres***

После запуска приложения в базе данных будет создан один пользователь: 
***admin*** c паролем ***1***

### Полезные ссылки
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot FlyWay: миграции БД, профиль пользователя](https://www.youtube.com/watch?v=ArM7nCys4hY&list=PLU2ftbIeotGpAYRP9Iv2KLIwK36-o_qYk&index=12)