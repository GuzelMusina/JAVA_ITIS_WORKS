package ru.itis.tvmain;

import ru.itis.channels.Channel;

import java.util.List;

public interface TVFunctional<T> {

    /**
     * сохранение канала
     *
     * @param channel канал
     * @return номер канала
     */
    int save(Channel channel);

    /**
     * Найти канал по его номеру
     *
     * @param number номер канала
     * @return канал
     */
    T shift(int number);

    /**
     * показывает каналы
     *
     * @return список каналов
     */
    List<T> move();


}
