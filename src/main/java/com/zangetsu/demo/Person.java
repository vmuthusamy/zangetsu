package com.zangetsu.demo;

/**
 * Created by vm023561 on 9/23/15.
 */
public class Person
{

    private String id;
    private String name;
    private String address;

    public Person (final String id, final String name)
    {
        this(id, name, null);
    }

    public Person (final String id, final String name, final String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }
}
