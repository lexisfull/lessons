
# LeetCode — Java Solutions

Коллекция задач LeetCode, решённых на **Java**. Задачи сгруппированы по темам для подготовки к техническим собеседованиям.

**Всего задач:** 7 · 4 Easy · 3 Medium

**Навигация:** название задачи открывает LeetCode, ссылка «Решение» — Java-файл в репозитории.

## Содержание

- [Массивы и хеширование](#массивы-и-хеширование)
- [Два указателя](#два-указателя)
- [Связные списки](#связные-списки)
- [Строки и генерация последовательностей](#строки-и-генерация-последовательностей)
- [Стек](#стек)
- [Очередь и скользящее окно](#очередь-и-скользящее-окно)
- [Следующая задача](#следующая-задача)

---

## Массивы и хеширование

### [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) · Easy

- **Решение:** [IntersectionTwoArrays.java](src/IntersectionTwoArrays.java)
- **Алгоритм:** `HashSet`. Сохраняем элементы первого массива, затем проверяем элементы второго. `remove()` позволяет исключить дубликаты.
- **Задача:** найти общие уникальные элементы двух массивов.
- **Сложность:** O(n + m) по времени в среднем, O(n + k) по памяти.

---

## Два указателя

### [167. Two Sum II — Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) · Medium

- **Решение:** [TwoSumIISortedArray.java](src/TwoSumIISortedArray.java)
- **Алгоритм:** Two Pointers. Указатели располагаются в начале и конце отсортированного массива. При сумме больше target двигаем правый указатель влево, при меньшей — левый вправо.
- **Задача:** найти индексы двух чисел, сумма которых равна target.
- **Сложность:** O(n) по времени, O(1) по памяти.

---

## Связные списки

### [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) · Easy

- **Решение:** [LinkedListCycle.java](src/LinkedListCycle.java)
- **Алгоритм:** Floyd's Cycle Detection (Slow/Fast Pointers). Медленный указатель проходит один узел, быстрый — два.
- **Задача:** определить наличие цикла в односвязном списке.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [707. Design Linked List](https://leetcode.com/problems/design-linked-list/) · Medium

- **Решение:** [MyLinkedList.java](src/MyLinkedList.java)
- **Алгоритм:** собственная реализация Linked List.
- **Задача:** реализовать получение, добавление и удаление элементов связного списка.
- **Что тренирует:** ссылки между узлами, head, индексы, граничные случаи.

---

## Строки и генерация последовательностей

### [481. Magical String](https://leetcode.com/problems/magical-string/) · Medium

- **Решение:** [MagicalString.java](src/MagicalString.java)
- **Алгоритм:** Two Pointers + Simulation. Генерация последовательности с использованием указателя длины группы и чередования символов.
- **Задача:** посчитать количество единиц среди первых n символов магической строки.
- **Сложность:** O(n) по времени, O(n) по памяти.

---

## Стек

### [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) · Easy

- **Решение:** [ValidParentheses.java](src/ValidParentheses.java)
- **Алгоритм:** Stack (LIFO) через `ArrayDeque`, сопоставление скобок через `Map`.
- **Задача:** проверить правильность вложенности и закрытия скобок.
- **Сложность:** O(n) по времени, O(n) по памяти.

---

## Очередь и скользящее окно

### [933. Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/) · Easy

- **Решение:** [RecentCounter.java](src/RecentCounter.java)
- **Алгоритм:** Queue (FIFO) + Sliding Window. Добавляем время запроса, удаляем запросы старше t - 3000.
- **Задача:** подсчитать количество запросов за последние 3000 миллисекунд.
- **Сложность:** O(1) амортизированно на вызов, O(k) по памяти, где k — количество запросов в окне.

---

## Следующая задача

### [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) · Easy

- **Возможные алгоритмы:** StringBuilder, Stack или Two Pointers.
- **Задача:** сравнить две строки после обработки символов Backspace (`#`).
- **Статус:** пока не добавлена в src.

---

`src/Main.java` — вспомогательный файл, не отдельная задача LeetCode.
