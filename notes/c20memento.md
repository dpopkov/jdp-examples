## Memento Pattern

#### Определение GoF
Хранитель (Memento) позволяет, не нарушая инкапсуляцию, зафиксировать и сохранить внутреннее состояние объекта
таким образом, что объект позднее может быть восстановлен в это же состояние.

#### Концепция
Следуя ОО принципам вы можете сохранить состояние объекта. Всегда когда вы хотите восстановить объект к его 
предыдущему состоянию, вы можете рассмотреть использование этого шаблона.  
В шаблоне 3 участника: memento, originator, and caretaker (or client). Последовательность такая: originator имеет
внутреннее состояние, а клиент может менять это состояние. Чтобы сохранить текущее состояние originator клиент
запрашивает у него объект memento. Клиент может передать memento обратно в originator, чтобы восстановить сохраненное
состояние. При правильной реализации это не нарушает инкапсуляцию.

#### Пример
Игра включающая множество уровней разной степени сложности. Когда делаете паузу на определенном уровне, то вы можете
позднее продолжить с этого же места, либо прыгнуть назад, на предыдущий уровень.

[Local Code Example](../src/main/java/learn/dp/jdpexamples/c20memento)