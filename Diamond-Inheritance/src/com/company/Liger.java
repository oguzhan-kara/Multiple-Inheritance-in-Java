package com.company;

public interface Liger extends Lion,Tiger,Cat {

    
    @Override
    void run();

    @Override
    void roar();

    @Override
    void breath();
}
