package api;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String login;
    private String password;
    private String role;
    private List<String> permissions;

    public User(String firstName, String lastName, int age, String login, String password, String role,
                List<String> permissions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;
        this.role = role;
        this.permissions = permissions;
    }

    private Stream<User> getUsers() {
        return Stream.of(
                new User(
                        "John",
                        "Willington",
                        24,
                        "admin@test.com",
                        "qwerty1",
                        "Admin",
                        Lists.newArrayList("READ", "CREATE", "UPDATE", "DELETE", "BULK_CREATE")
                ),
                new User(
                        "John",
                        "Willington",
                        24,
                        "admin@test.com",
                        "qwerty1",
                        "Admin",
                        Lists.newArrayList("READ", "CREATE", "UPDATE", "DELETE", "BULK_CREATE")
                ),
                new User(
                        "John",
                        "Willington",
                        24,
                        "admin@test.com",
                        "qwerty1",
                        "Admin",
                        Lists.newArrayList("READ", "CREATE", "UPDATE", "DELETE", "BULK_CREATE")
                ),
                new User(
                        "John",
                        "Willington",
                        24,
                        "admin@test.com",
                        "qwerty1",
                        "Admin",
                        Lists.newArrayList("READ", "CREATE", "UPDATE", "DELETE", "BULK_CREATE")
                ),
                new User(
                        "John",
                        "Willington",
                        24,
                        "admin@test.com",
                        "qwerty1",
                        "Admin",
                        Lists.newArrayList("READ", "CREATE", "UPDATE", "DELETE", "BULK_CREATE")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getUsers")
    public void

}
