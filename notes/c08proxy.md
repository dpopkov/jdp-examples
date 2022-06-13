## Proxy Pattern

#### Определение GoF
Предоставляет Заместителя (surrogate) или Заполнителя (placeholder) для другого объекта, чтобы
контролировать к нему доступ.

#### Концепция
Бывают ситуации когда вы хотите ограничить прямую коммуникацию между объектом и внешним миром.
Для этого могут быть разные причины. Например вам нужно обеспечить дополнительную безопасность,
либо вам нужно улучшить время отклика, либо у вас ограниченные ресурсы, либо финальный продукт все
еще находится в стадии разработки.  
Proxy бывают различных типов, но фундаментально они являются заменителями или заполнителями оригинального
объекта. Как результат, когда клиент взаимодействует с Proxy, это выглядит так что он общается
напрямую с исходным объектом, хотя это не так. Используя этот шаблон, вы можете использовать класс,
работающий в качестве интерфейса к исходному классу.

#### Пример
Рассмотрим ситуацию когда определенный школьный учитель отсутствует по некоторым независящим от него
причинам. Руководство школы может послать другого учителя на замену.  
В примере с банкоматом конкретный банкомат может использовать Proxy объекты для предоставления
банковской информации которая на самом деле хранится не в банкомате, а на удаленном сервере.

#### Примеры из разработки
Создание множества экземпляров сложных объектов может быть ресурсоемким. Эти ресурсы могут не быть
легкодоступными. В такой ситуации вы можете создавать многочисленные Proxy объекты указывающие
на исходный объект. Такой механизм может помочь сохранить память и улучшить производительность
приложения.  
Другой частый пример использования Proxy это ситуация когда пользователи не хотят раскрывать
настоящий IP адрес своих машин.  
Примеры из JDK:
* В пакете _java.lang.reflect_ класс Proxy и интерфейс InvocationHandler поддерживают похожую концепцию
* Пакет _java.rmi_ предоставляет возможности для объекта из одной jvm делать вызовы методов объектов
живущих в другой jvm.
  
[Пример кода](../src/main/java/learn/dp/jdpexamples/c08proxy)

#### Типы Proxy
* _Remote proxy_ - могут скрывать объект, который живет в другом адресном пространстве.
* _Virtual proxy_ - используются для оптимизации, такой как создание легкого объекта в начале и создание 
тяжелого объекта только когда это действительно нужно.
* _Protection proxy_ - ограничивают доступ согласно правам доступа.
* _Smart reference_ - производят дополнительные "хозяйственные" действия во время доступа клиента к объекту,
например подсчет кол-ва ссылок на объект в конкретный момент времени.