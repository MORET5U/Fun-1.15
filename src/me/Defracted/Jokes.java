package me.Defracted;

import java.util.Random;

public class Jokes {
    private static Random random = new Random();

    public static String[] DumbJokes = {
            "Выводы, сделанные из выводов — это квинтэссенция результата.",
            "Москвичи умеют определять точное время по длине пробок.",
            "— Дочь, ты пила?\n— Нет, мама, я топор!",
            "— Ты шутишь хуже чем Елена воробей\n— КАПИТАН Елена Воробей!",
            "Свежо пердение, но дышится с трудом!",
            "— Скажи триста.\n— Триста.\n— Абстрагируйся от суеты, достигнув с космосом единства.",
            "— Помогите мне избавиться от комплексов!\n— От каких именно?\n— От зенитно—ракетных.",
            "— Вы сообразительный?\n— В смысле?"
    };

    public static String throwJoke(String[] array) {
        int rnd = random.nextInt(array.length);
        return array[rnd];
    }
}
