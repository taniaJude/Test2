package guru.springframework.di.services;

public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Helloo World!";
    }
}
