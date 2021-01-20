package com.company.factory;

import com.company.controllers.DirectoryController;
import com.company.interfaces.*;
import com.company.model.Directory;
import com.company.model.File;
import com.company.controllers.FileController;
import com.company.model.Owner;

import java.util.ArrayList;
import java.util.List;

//Factory Pattern
// Class that will create instances of objects of model --> Could also use dependency injection
public final class Factory {

    private Factory(){}

    public static IFile createFile(){
        return new File(createOwner(), createDirectory());
    }

    public static IDirectory createDirectory(){
        return new Directory(createOwner(), createEmptyListOfFiles(), createEmptyListOfDirectories() );
    }

    public static IOwner createOwner(){return new Owner();}

    public static List<IFile> createEmptyListOfFiles(){
        return new ArrayList<IFile>();
    }

    public static List<IDirectory> createEmptyListOfDirectories(){
        return new ArrayList<IDirectory>();
    }

    public static IFileController createFileControler(){
        return new FileController(createFile());
    }

    public static IDirectoryController createDirectoryController(){
        return new DirectoryController(createDirectory());
    }




}
