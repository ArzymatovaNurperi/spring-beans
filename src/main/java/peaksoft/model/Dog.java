package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends  Animal{
    @Override
    public String toString() {
        return "I am a dog";
    }
}
