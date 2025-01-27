package ru.astondevs.lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> {
    /**
     * Начальная емкость массива по умолчанию
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Массив, где хранятся элементы
     */
    private Object[] elements;

    /**
     * Фактический размер коллекции. Считается по добавленным элементам
     */
    private int size;

    /**
     * Пустой массив
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Инициализация коллекции с начальной емкостью по умолчанию
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Инициализация коллекции с заданной емкостью
     * @param  initialCapacity  заданная емкость коллекции
     * @throws IllegalArgumentException Если заданная емкость меньше нуля
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
                this.elements = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    /**
     * Увеличение емкости массива в два раза при заполнении
     * @param currentSize Новый текущий размер, под который нужно увеличить массив
     * @return Увеличенный массив
     */
    private Object[] grow(int currentSize) {
        if (currentSize > 0) {
            return elements = Arrays.copyOf(elements, size*2);
        }
        else {
            return elements = new Object[DEFAULT_CAPACITY];
        }
    }

    /**
     * Возвращает количество элементов в коллекции
     * @return Возвращает количество элементов в коллекции
     */
    public int size() {
        return size;
    }

    /**
     * Добавляет элемент в конец коллекции
     * @param element элемент, который будет добавлен в конец коллекции
     */
    public void add(T element) {
        if (size == elements.length) {
            grow(size);
        }
        elements[size] = element;
        size++;
    }

    /**
     * Добавляет элемент в указанную позицию, сдвигая остальные элементы вправо
     * @param index индекс, по которому элемент будет добавлен, начиная с 0
     * @param element элемент, который будет добавлен по индексу
     */
    public void add(int index, T element) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(index);
        if (size == elements.length) {
            grow(size);
        }
        System.arraycopy(elements, index, elements, index+1, size - index);
        elements[index] = element;
        size++;
    }

    /**
     * Возвращает элемент, находящийся по указанному индексу
     * @param index индекс, по которому элемент будет найден
     * @return элемент, который будет получен по индексу
     */
    public T get(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(index);
        return (T) elements[index];
    }

    /**
     * Удаляет элемент по указанному индексу
     * @param index индекс элемента, который нужно удалить
     * @return удаленный элемент
     */
    public T remove(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(index);
        T oldElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size -1 - index);
        size--;
        elements[size] = null;
        return oldElement;
    }

    /**
     * Очищает коллекцию. Коллекция становится пустой, нулевого размера
     */
    public void clear() {
        size = 0;
        elements = EMPTY_ELEMENTDATA;
    }

    /**
     * Сортирует коллекцию в соответствии с переданным компаратором
     * @param comparator компаратор
     */
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort((T[])elements, 0, size, comparator);
    }
}
