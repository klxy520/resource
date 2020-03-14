package com.xnky.taotao.observer;

public interface Subject {
    void register(Obersver obersver);
    void  delete(Obersver obersver);
    void  otify();
}
