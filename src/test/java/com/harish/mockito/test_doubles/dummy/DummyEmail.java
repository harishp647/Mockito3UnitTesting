package com.harish.mockito.test_doubles.dummy;

public class DummyEmail implements EmailService{
    @Override
    public String sendEmail(String Message) {
        throw new AssertionError("method not implemented");
    }
}
