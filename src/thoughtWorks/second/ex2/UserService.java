package thoughtWorks.second.ex2;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void login(String username, String password) {
        if (userRepository.isValid(username, password)) {
            redirect("HomePage");
        }
        redirect("ErrorPage");
    }


    public void login(String username, String password) {
        if (!userRepository.isValid(username, password)) {
            redirect("ErrorPage");
        }
        redirect("HomePage");
    }
}
