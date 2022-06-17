## Flyweight Pattern

#### Определение GoF
Хранит общие данные в одном месте ради эффективного поддержания большого числа объектов.

#### Концепция
Иногда вам приходится иметь дело с очень похожими объектами, которые в то же время различаются.
Ограничение таково что вы не хотите создавать их всех, чтобы не тратить зря ресурсы и память.
Шаблон Приспособленец придуман, чтобы решить эту проблему.

Чтобы работать с шаблоном Приспособленец нужно сначала определить:
* Каковы состояния моих объектов
* Какие части этих состояний могут быть изменены

После чего состояния разбиваются на две группы:
* внутренне присущие (intrinsic), которые не меняются
* внешние неприсущие (extrinsic), которые могут меняться

Если вы создадите объекты с внутренними состояниями, вы можете делиться ими.
Для внешних состояний клиент должен передать информацию. Когда бы вы ни захотели получить объект,
вы получаете объект с внутренними состояниями и затем вы можете конфигурировать объект на лету (on the fly)
передавая ему внешние состояния. Эта техника понижает кол-во ненужных операций по созданию объектов
и снижает использование памяти. 

GoF:

    A flyweight is a shared object that can be used in multiple contexts simulta-
    neously. The flyweight acts as an independent object in each context—it’s
    indistinguishable from an instance of the object that’s not shared. Flyweights
    cannot make assumptions about the context in which they operate. The key
    concept here is the distinction between intrinsic and extrinsic states. The
    intrinsic state is stored in the flyweight; it consists of information that’s
    independent of the flyweight’s context, thereby making it sharable. The
    extrinsic state depends on and varies with the flyweight’s context and there-
    fore can’t be shared. Client objects are responsible for passing extrinsic state
    to the flyweight when it needs it.

#### Пример
Шариковая ручка со сменяемыми стержнями. Вы можете менять стержни, чтобы писать разными цветами.
Ручка без стержня может рассматриваться как Приспособленец с внутренними данными, а стержни
как внешние данные. Рассмотрим случай, когда у вас много ручек с различными стержнями. Несколько красных
ручек и несколько зеленых. Вы хотите раздать эти ручки детям. Позже вы замечаете, что детям красные ручки
нравятся больше, чем зеленые. Тогда вы заменяете зеленые стержни на красные, чтобы получить больше
красных ручек и раздать их счастливым детям.

Другой пример. Компании нужно напечатать визитки для сотрудников. Копировальный департамент может
создать общий шаблон с логотипом компании, адресом и другими деталями уже напечатанными (intrinsic), 
а позже компания добавит детали конкретного сотрудника (extrinsic) на каждую визитку.

#### Пример из разработки
Рассмотрим компьютерную игру с большим кол-вом участников, основные данные которых одинаковы,
но внешность различается (разные состояния, цвета, оружие и т.п.). Когда игра начинается, если 
вы захотите хранить все эти объекты со всеми этими состояниями, это может привести к большому 
расходу памяти. Вместо хранения всех этих объектов, вы можете спроектировать приложение таким
образом, чтобы создавать один объект с состояниями, которые неизменные для прочих объектов,
а ваш клиент позаботится об оставшихся состояниях.

Примеры JDK:
* Использование классов-оболочек вроде _java.lang.Integer_, _java.lang.Short_, _java.lang.Byte_ 
и _java.lang.Character_ где статический метод _valueOf()_ воспроизводит фабричный метод. Этот 
метод проверяет, не присутствует ли нужный объект в кэше, если да, то он и возвращается.
* Пул строк в JVM является другим примером Приспособленца. Когда вы вызываете метод _intern()_,
он также возвращает объект из кэша.

[Local Code Example](../src/main/java/learn/dp/jdpexamples/c12flyweight)