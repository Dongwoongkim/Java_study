package thoughtWorks.second.ex2;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, String> info = new HashMap<>();

    public boolean isValid(String username, String password) {
        return info.get(username)
                .equals(password);
    }
}
