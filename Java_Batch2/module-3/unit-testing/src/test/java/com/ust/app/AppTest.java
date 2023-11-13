package com.ust.app;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppTest {

    @Mock
    AppService service;

    @InjectMocks
    App app;

    @Test
    public void testCheckEven() {

        when(service.checkEven(10)).thenReturn(true);
        when(service.checkEven(5)).thenReturn(false);

        assertTrue(app.checkEven(10));
        assertFalse(app.checkEven(5));

        verify(service,times(1)).checkEven(10);
        verify(service,times(1)).checkEven(5);

    }
}