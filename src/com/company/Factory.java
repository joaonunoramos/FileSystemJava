package com.company;

// Class that will create instances of objects of model --> Could also use dependency injection
public final class Factory {

    private Factory(){}

    public static IFile createFile(){
        return new File();
    }

    public static IDirectory createDirectory(){
        return new Directory();
    }


}
