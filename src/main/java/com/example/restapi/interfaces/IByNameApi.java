package com.example.restapi.interfaces;



public interface IByNameApi<T extends IWithName> {

    T findByName(final String name);

}
