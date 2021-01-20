package com.company.controllers;

import com.company.interfaces.IDirectory;
import com.company.interfaces.IFile;
import com.company.interfaces.IFileController;
import com.company.interfaces.IOwner;
import com.company.model.Directory;

public class FileController implements IFileController {

    private IFile file;

    public FileController(IFile file){
        this.file = file;
    }


    @Override
    public void changeName(String newName) {
        try{
            this.file.changeName(newName);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void updateModifyDate() {
        this.file.updateModifyDate();
    }

    @Override
    public void changeOwner(IOwner newOwner) {
        try{
            this.file.changeOwner(newOwner);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void updateDirectory(IDirectory newDirectory) {
        try{
            this.file.updateDirectory(newDirectory);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    @Override
    public void changeReadPermission() {
        this.file.changeReadPermission();
    }

    @Override
    public void changeWritePermission() {
        this.file.changeWritePermission();
    }
}
