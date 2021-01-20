package com.company.model;

import com.company.interfaces.IDirectory;
import com.company.interfaces.IFile;
import com.company.interfaces.IOwner;

import java.util.List;

public class Directory implements IDirectory {

    private List<IFile> listOfFiles;
    private List<IDirectory> listOfDirectories;
    private IOwner owner;
    private String name;
    private boolean canWrite;
    private boolean canRead;


    public List<IFile> getListOfFiles() {
        return listOfFiles;
    }

    public void setListOfFiles(List<IFile> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    public List<IDirectory> getListOfDirectories() {
        return listOfDirectories;
    }

    public void setListOfDirectories(List<IDirectory> listOfDirectories) {
        this.listOfDirectories = listOfDirectories;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setOwner(IOwner owner) {
        this.owner = owner;
    }

    public IOwner getOwner() {
        return owner;
    }



    public Directory(IOwner owner, List<IFile> listOfFiles, List<IDirectory> listOfDirectories){
        this.owner = owner;
        this.listOfFiles = listOfFiles;
        this.listOfDirectories = listOfDirectories;
        this.name = "Default name";
        this.canRead = true;
        this.canWrite = true;
    }

    private Directory(){}


    @Override
    public void deleteFile(String nameOfFileToDelete) {
        for(IFile file: this.listOfFiles ){
           if(file.getName() == nameOfFileToDelete){
               this.listOfFiles.remove(file);
           }
        }
    }

    @Override
    public void deleteAllFiles() {
        this.listOfFiles.clear();
    }

    @Override
    public void deleteDirectory(String directoryToDelete) {
        for(IDirectory directory: this.listOfDirectories ){
            if(directory.getName() == directoryToDelete){
                this.listOfFiles.remove(directory);
            }
        }
    }

    @Override
    public void deleteAllDirectories() {
        this.listOfDirectories.clear();
    }

    @Override
    public void addFile(IFile newFile) {
        if(newFile == null){
            throw new IllegalArgumentException("File to add can't be null");
        }
        this.listOfFiles.add(newFile);
    }

    @Override
    public void addDirectory(IDirectory newDirectory) {
        if(newDirectory == null){
            throw new IllegalArgumentException("Directory to add can't be null");
        }
        this.listOfDirectories.add(newDirectory);
    }

    @Override
    public void changeReadPermission() {
        this.canRead = !this.canRead;
    }

    @Override
    public void changeWritePermission() {
        this.canWrite = !this.canWrite;
    }

    @Override
    public void changeOwner(IOwner owner) {
        if(owner == null){
            throw new IllegalArgumentException("Owner of file can't be null");
        }
        setOwner(owner);
    }


    @Override
    public void changeName(String newName) {
        if(newName.length() == 0 || newName == null){
            throw new IllegalArgumentException("New name of directory can't be null");
        }
        setName(newName);
    }


    @Override
    public String toString() {
        return "Directory{" +
                "listOfFiles=" + listOfFiles +
                ", listOfDirectories=" + listOfDirectories +
                ", name='" + name + '\'' +
                ", canWrite=" + canWrite +
                ", canRead=" + canRead +
                '}';
    }


}
