1. При создании методов toGo(), fly(), swim(), было не понимание, как бы не копировать полностью метод fly, swim(), а перезагрузить изменив Println()
2. Так же не очень удачным решением является формировать красивую строку с точки зрения русского языка, возможно этим должен заниматься отдельный метод.
```
Вывод:
Животное («Чаппи») прошло 10 метров. Статистика подвижности: 10
Собака по имени («Чаппи») может летать только во снах! Статистика подвижности: 10
   ```
3. Так же при попытке добавить собственный метод у нового класса `Sparrow` в методе main можно только благодаря следующей конструкции `((Sparrow) sparrow).moveByJumping(10);` что это?
<br />Получается что если нужно добавить отдельный метод, его всё равно нужно объявлять в родительском классе? 
4. Так же добавил новое поле, которое аккумулирует все передвижения животных и фиксирует сумму подвижности.


---------------
1) Добавить в класс Animal публичные методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
   наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В `main` добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
4) В файле readme.md в репозитории гитхаб описать
   какие проблемы в таком проектировании Вы увидели,
   а также там же написать возникшие при выполнении дз вопросы
   (если они есть)


Формат сдачи:
Ссылка на гитхаб
