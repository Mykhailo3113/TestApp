package api;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckUsers extends User {
    @ParameterizedTest
    @MethodSource("getUsers")
    public void getValidAccessToken(User user) {
        Response response = // тут POST запрос на /token
                String entity = response.readEntity(String.class);
        assertThat(entity // тут надо верифицировать токен и ассертнуть шо он валидный);
    }

}
