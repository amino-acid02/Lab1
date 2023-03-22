package com.mycompany.mavenproject3;

public abstract class Books {
    
    public String name;
    public String author;
    public String type;
    public String level;
    public String university;

    public abstract void setName(String name);
    public abstract void setAuthor(String author);
    public abstract void setLevel(String level);
    public abstract void setType(String type);
    public abstract void setUniversity(String university);
    
    public abstract String getName();
    public abstract String getAuthor();
    public abstract String getLevel();
    public abstract String getType();
    public abstract String getUniversity();

}

