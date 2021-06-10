package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://avatars.githubusercontent.com/z"),
            new User("002", "Paul", "https://avatars.githubusercontent.com/az"),
            new User("003", "Phil", "https://avatars.githubusercontent.com/u/84316014?v=4"),
            new User("004", "Guillaume", "https://avatars.githubusercontent.com/yaz"),
            new User("005", "Francis", "https://avatars.githubusercontent.com/t"),
            new User("006", "George", "https://avatars.githubusercontent.com/paq"),
            new User("007", "Louis", "https://avatars.githubusercontent.com/p"),
            new User("008", "Mateo", "https://avatars.githubusercontent.com/df"),
            new User("009", "April", "https://avatars.githubusercontent.com/mlk"),
            new User("010", "Louise", "https://avatars.githubusercontent.com/mlka"),
            new User("011", "Elodie", "https://avatars.githubusercontent.com/lqae"),
            new User("012", "Helene", "https://avatars.githubusercontent.com/azsq"),
            new User("013", "Fanny", "https://avatars.githubusercontent.com/mlp"),
            new User("014", "Laura", "https://avatars.githubusercontent.com/omg"),
            new User("015", "Gertrude", "https://avatars.githubusercontent.com/era"),
            new User("016", "Chloé", "https://avatars.githubusercontent.com/bd"),
            new User("017", "April", "https://avatars.githubusercontent.com/u"),
            new User("018", "Marie", "https://avatars.githubusercontent.com/kf"),
            new User("019", "Henri", "https://themarketperiodical.com/wp-content/uploads/2021/01/polkadot-3.jpg"),
            new User("020", "Rémi", "https://avatars.githubusercontent.com/doge")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://avatars.githubusercontent.com/meow"),
            new User("022", "Geoffrey", "https://avatars.githubusercontent.com/mete"),
            new User("023", "Simon", "https://avatars.githubusercontent.com/meteor"),
            new User("024", "André", "https://avatars.githubusercontent.com/steak"),
            new User("025", "Leopold", "https://avatars.githubusercontent.com/vis")
    );
}
