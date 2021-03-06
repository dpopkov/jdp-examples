## Factory Method Pattern

#### Определение GoF
Шаблон определяет интерфейс для создания объекта, но позволяет под-классам решать какой
конкретно класс инстанциировать. 
__Factory Method Pattern__ позволяет классу делегировать инстанциирование своим под-классам.

#### Концепция
Существует абстрактный класс-создатель определяющий базовую структуру приложения
и под-классы производные от этого абстрактного класса, которые берут на себя ответственность за
реальный процесс инстанциирования.

#### Пример
Компания производит машины разных моделей каждый год. Основываясь на исследованиях рынка она решает 
какую модель производить и начинает производство. Для конкретной модели машины производятся различные детали
и отправляются на сборку. Компания всегда должна быть готова предоставить лучшие модели для своих 
клиентов в ближайшем будущем. Если компании приходится создавать полностью новое производство для
новой модели содержащей только некоторые новшества, то это сильно отразится на прибыли компании.
То есть компания должна настроить производство таким образом, чтобы легко производить детали для будущих моделей.

#### Пример из разработки
При использовании БД может возникнуть потребность поддержки пользователей разных БД. Например один пользователь
может использовать MS SQL Server, а другой - Oracle. Когда нужно вставить данные в таблицу, то в начале потребуется
создать Connection объект, такой как SqlServerConnection или OracleConnection. Если поместить код в if-else блок,
то возможно придется многократно повторять один и тот же код, что затрудняет поддержку. И когда потребуется
добавить новый тип Connection, то придется везде вносить изменения. Такой тип проблемы может быть решен использованием
__Factory Method pattern__.

Конкретным примером из JDK может служить метод _iterator()_ из _AbstractCollection<E>_ (or Collection<E>). 
