package com.company.controllers;

import com.company.interfaces.IDirectory;
import com.company.interfaces.IDirectoryController;
import com.company.interfaces.IFile;
import com.company.interfaces.IOwner;

public class DirectoryController implements IDirectoryController {

    private IDirectory directory;


    public DirectoryController(IDirectory directory){
        this.directory = directory;
    }


    @Override
    public void deleteFile(String nameFileToDelete) {
        this.directory.deleteFile(nameFileToDelete);
    }

    @Override
    public void deleteAllFiles() {
        this.directory.deleteAllFiles();
    }

    @Override
    public void deleteDirectory(String nameDirectoryToDelete) {
        this.directory.deleteDirectory(nameDirectoryToDelete);
    }

    @Override
    public void deleteAllDirectories() {
        this.directory.deleteAllDirectories();
    }

    @Override
    public void addFile(IFile newFile) {
        try{
            this.addFile(newFile);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void addDirectory(IDirectory newDirectory) {
        try{
            this.addDirectory(newDirectory);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void changeReadPermission() {
        this.directory.changeReadPermission();
    }

    @Override
    public void changeWritePermission() {
        this.directory.changeWritePermission();
    }

    @Override
    public void changeOwner(IOwner owner) {
        try{
            this.changeOwner(owner);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void changeName(String newName) {
        try{
            this.changeName(newName);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
