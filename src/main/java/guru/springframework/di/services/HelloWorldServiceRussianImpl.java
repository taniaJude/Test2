package guru.springframework.di.services;

public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Привет мир!!!!!!";
    }
}
