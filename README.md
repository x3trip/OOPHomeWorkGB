# Домашние работы по Java ООП
Здесь находятся все домашние задания по ООП на языке Java

Код заданий находится в файле




- [x] Выполнить ДЗ с первого семинара
- [x] Выполнить ДЗ со второго семинара
- [x] Выполнить ДЗ с третьего семинара
- [x] Выполнить ДЗ с четвертого семинара
- [x] Выполнить ДЗ с пятого семинара
- [x] Выполнить ДЗ с шестого семинара
- [x] Выполнить ДЗ с седьмого семинара





Домашние задания:

<details><summary>Home Work 1</summary>

- Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса наследника Animal, умеющих летать, плавать, бегать. В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в таком проектировании Вы увидели, там же написать возникшие при выполнении дз вопросы (если они есть).
</details>

<details><summary>Home Work 2</summary>

- Создать класс Doctor. Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть
методы получения скорости заданного действия.

Добавьте наследников этим интерфейсам, но таким образом,
чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих и вообще всех животных.

Постарайтесь максимально логично переписать архитектуру проекта.

*Факультативное задание (особенно java-разработчикам). Установить gradle. Добавить lombok в зависимости, и заменить геттеры и сеттеры на аннотации. Если сделаете это задание, скопируйте код проекта в проект gradle.

</details>

<details><summary>Home Work 3</summary>

- Создать сет компонентов, и сделать так, чтобы в нем не было 2 одинаковых. (Специально создать два одинаковых компонента в Main и попытаться их добавить в сет)
- Set<Component> result = new HashSet<>(components); (подсказка переопределить методы equals и hashCode).
- Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства

</details>

<details><summary>Home Work 4</summary>

Ознакомиться со статьей о LinkedList
Реализовать свой LinkedList с методами вставки в начало, конец списка, получения размера списка и получения элемента по индексу (можете добавить какие-то еще).
В качестве альтернативы вы можете переделать код из семинара, но так, чтобы у Вас был начальный capacity (что такое capacity обсуждаем в конце семинара)
Сдать можно оба задания, либо какое-то одно на выбор.
Если эти два задания для Вас очень сложные, попробуйте покрыть код из семинара тестами (все методы, причем подумайте о разных кейсах тестирования). Как писать unit-тесты и подключить библиотеку junit я рассказываю в конце семинара, после разбора дз :)
Все задания очень полезны и пригодяться в работе и при трудоустройстве

</details>

<details><summary>Home Work 5</summary>

- Доработать справочник пользователей, для удаления. Поработать над проектом.(не обязательно, желательно для java-разработчиков)
- Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой, и разделителем - пустой строкой. Предусмотреть сохранение в старом формате. На ваше усмотрение (по вкусу), но что - то изменить надо.
- Попробуйте создать систему логирования.
(ВНЕСИТЕ СВОИ ИЗМЕНЕНИЯ В ПРОЕКТ, КОТОРЫЕ КАЖУТЬСЯ ЛОГИЧНЫМИ ВАМ.)

- Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в него систему логирования

</details>

<details><summary>Home Work 6</summary>

- Подумать и исправить те принципы SOLID которые нарушены в пакете homework.
- Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а

Необязательные:
- Сделать Figure из srp1 абстрактным классом и продумать его структуру,
- Saver из srp2 параметризовать, чтобы работал с любыми объектами

</details>

<details><summary>Home Work 7</summary>
 - Дописать проект, "Записная книжка", содержащий работу с записками из консоли (можно прочитать все записки, создать одну записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум 3 поля Id, заголовок и текст, можно добавить дату. Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока. Если вы сделали записки к этому уроку, то добавить логирование.
  - Продумать, какие паттерны можно использовать в вашем проекте

</details>

