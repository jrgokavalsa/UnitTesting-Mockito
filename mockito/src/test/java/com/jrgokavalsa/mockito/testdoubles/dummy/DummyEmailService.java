package com.jrgokavalsa.mockito.testdoubles.dummy;

public class DummyEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Method not yet implemented");
    }
}
