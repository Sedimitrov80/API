package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.patronymic = "Васильевич";
        post.surname = "Иванов";
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 1965;
        post.passport = "1961 № 090334";
        post.phone = "+7 (921)-124-19-61";
        post.subscription = true;
    }
}
