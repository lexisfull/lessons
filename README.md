
# LeetCode — Java Solutions

Коллекция задач LeetCode, решённых на **Java**. Задачи сгруппированы по темам для подготовки к техническим собеседованиям.

**Всего задач:** 12 · 7 Easy · 5 Medium

**Навигация:**
- Название задачи → LeetCode
- Ссылка «Решение» → Java-файл в репозитории

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
- **Алгоритм:** HashSet.
- **Задача:** найти общие уникальные элементы двух массивов.
- **Подход:** сохраняем элементы первого массива в HashSet, затем проверяем элементы второго. `remove()` исключает повторное попадание числа в результат.
- **Сложность:** O(n + m) по времени в среднем, O(n + k) по памяти.

---

## Два указателя

### [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/) · Medium

- **Решение:** [ContainerWithMostWater.java](src/ContainerWithMostWater.java)
- **Алгоритм:** Two Pointers.
- **Задача:** найти две вертикальные линии, которые вместе с осью X образуют контейнер, вмещающий максимальное количество воды.
- **Подход:** устанавливаем `left` в начало массива, а `reight` — в конец. Вычисляем площадь как `Math.min(height[left], height[reight]) * length` и обновляем максимум `res`. Сдвигаем указатель со стороны меньшей высоты; при равных высотах — правый. Более высокая граница не увеличит площадь при прежней меньшей высоте и сокращении ширины. После каждого шага уменьшаем `length` на один: она всегда равна `reight - left`. Возвращаем максимальную найденную площадь.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) · Easy

- **Решение:** [RemoveDuplicatesFromSortedArray.java](src/RemoveDuplicatesFromSortedArray.java)
- **Алгоритм:** Two Pointers.
- **Задача:** удалить дубликаты из отсортированного массива на месте и вернуть количество уникальных элементов.
- **Подход:** `left` указывает на последний уникальный элемент, а `i` проходит массив. При обнаружении нового значения записываем его в `nums[left + 1]` и сдвигаем `left`. Для пустого массива возвращаем `0`, иначе — `left + 1`. Первые элементы массива до возвращённой длины содержат уникальные значения.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [167. Two Sum II — Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) · Medium

- **Решение:** [TwoSumIISortedArray.java](src/TwoSumIISortedArray.java)
- **Алгоритм:** Two Pointers.
- **Задача:** найти индексы двух чисел, сумма которых равна target.
- **Подход:** два указателя находятся в начале и конце отсортированного массива. Если сумма больше target, сдвигаем правый указатель влево. Если меньше — левый вправо.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) · Easy

- **Решение:** [ValidPalindrome.java](src/ValidPalindrome.java)
- **Алгоритм:** Two Pointers.
- **Задача:** проверить, является ли строка палиндромом, игнорируя регистр и символы, не являющиеся буквами или цифрами.
- **Подход:** устанавливаем указатели на начало и конец строки. Пропускаем неподходящие символы через `Character.isLetterOrDigit()`, сравниваем оставшиеся символы через `Character.toLowerCase()`.
- **Сложность:** O(n) по времени, O(1) по памяти.

---

## Связные списки

### [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) · Easy

- **Решение:** [LinkedListCycle.java](src/LinkedListCycle.java)
- **Алгоритм:** Floyd's Cycle Detection (Slow/Fast Pointers).
- **Задача:** определить наличие цикла в односвязном списке.
- **Подход:** медленный указатель проходит один узел, быстрый — два. Если указатели встретились, цикл существует.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [707. Design Linked List](https://leetcode.com/problems/design-linked-list/) · Medium

- **Решение:** [MyLinkedList.java](src/MyLinkedList.java)
- **Алгоритм:** собственная реализация Linked List.
- **Задача:** реализовать получение, добавление и удаление элементов связного списка.
- **Что тренирует:** ссылки между узлами, head, индексы, граничные случаи.

---

## Строки и генерация последовательностей

### [481. Magical String](https://leetcode.com/problems/magical-string/) · Medium

- **Решение:** [MagicString.java](src/MagicString.java)
- **Алгоритм:** Two Pointers + Simulation.
- **Задача:** посчитать количество единиц среди первых n символов магической строки.
- **Подход:** генерация последовательности с использованием указателя длины группы и чередования символов.
- **Сложность:** O(n) по времени, O(n) по памяти.

---

## Стек

### [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) · Easy

- **Решение:** [ValidParentheses.java](src/ValidParentheses.java)
- **Алгоритм:** Stack (LIFO) через ArrayDeque.
- **Задача:** проверить правильность вложенности и закрытия скобок.
- **Подход:** открывающие скобки помещаются в стек, закрывающие сравниваются с последней добавленной скобкой. Для сопоставления используется Map.
- **Сложность:** O(n) по времени, O(n) по памяти.

---

## Очередь и скользящее окно

### [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) · Medium

- **Решение:** [LongestSubstringWithoutRepeatingCharacters.java](src/LongestSubstringWithoutRepeatingCharacters.java)
- **Алгоритм:** Sliding Window + HashSet.
- **Задача:** найти длину самой длинной подстроки без повторяющихся символов.
- **Подход:** храним символы текущего окна в HashSet. Если очередной символ уже есть в множестве, удаляем символы с левого края и сдвигаем `left`, пока повтор не исчезнет. Добавляем новый символ и обновляем максимальный размер окна.
- **Сложность:** O(n) по времени в среднем, O(min(n, A)) по памяти, где A — размер алфавита. Каждый символ добавляется и удаляется не более одного раза для каждой позиции строки.

### [643. Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) · Easy

- **Решение:** [MaximumAverageSubarrayI.java](src/MaximumAverageSubarrayI.java)
- **Алгоритм:** Sliding Window фиксированной длины.
- **Задача:** найти максимальное среднее значение среди непрерывных подмассивов длины `k`.
- **Подход:** считаем сумму первых `k` элементов и сохраняем её как текущий максимум. При сдвиге окна вычитаем уходящий элемент и прибавляем новый, обновляя максимальную сумму. Возвращаем `(double) max / k`.
- **Сложность:** O(n) по времени, O(1) по памяти.

### [933. Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/) · Easy

- **Решение:** [RecentCounter.java](src/RecentCounter.java)
- **Алгоритм:** Queue (FIFO) + Sliding Window.
- **Задача:** подсчитать количество запросов за последние 3000 миллисекунд.
- **Подход:** добавляем время нового запроса в очередь, удаляем запросы старше `t - 3000` и возвращаем размер очереди.
- **Сложность:** O(1) амортизированно на вызов, O(k) по памяти, где k — количество запросов в окне.

---

## Следующая задача

### [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) · Easy

- **Возможные алгоритмы:** StringBuilder, Stack или Two Pointers.
- **Задача:** сравнить две строки после обработки символов Backspace (`#`).
- **Статус:** пока не добавлена в src.

---

`src/Main.java` — вспомогательный файл, не отдельная задача LeetCode.
