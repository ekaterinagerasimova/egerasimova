package ru.job4j.condition;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        }
        return rsl;
    }
}