public class LoginContext {

    private LoginStrategy strategy;

    public LoginContext(LoginStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeLogin() {
        strategy.login();
    }
}