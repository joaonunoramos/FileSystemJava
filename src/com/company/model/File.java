package com.company.model;

import com.company.interfaces.IDirectory;
import com.company.interfaces.IFile;
import com.company.interfaces.IOwner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class File implements IFile {

    private String name;
    // in bits
    private int size;
    private Date creationDate;
    private Date lastModifiedDate;
    private List<String> content;
    private IOwner owner;
    private IDirectory directory;
    private boolean canRead;
    private boolean canWrite;

    public File(IOwner owner, IDirectory directory) {
        this.owner = owner;
        this.directory = directory;
        this.name = "Default name";
        this.size = 0;
        this.creationDate = new Date(System.currentTimeMillis());
        this.content = new ArrayList<>();
        this.canRead = true;
        this.canWrite = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public IOwner getOwner() {
        return owner;
    }

    public void setOwner(IOwner owner) {
        this.owner = owner;
    }

    public IDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(IDirectory directory) {
        this.directory = directory;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }


    @Override
    public void changeName(String newName) {
        if(newName.length() == 0 || newName == null){
            throw new IllegalArgumentException("New name of file can't be null or empty");
        }
        this.name = newName;
    }

    @Override
    public void updateModifyDate() {
        this.lastModifiedDate = new Date(System.currentTimeMillis());
    }

    @Override
    public void updateDirectory(IDirectory newDirectory) {
        if(newDirectory == null){
            throw new IllegalArgumentException("New directory is null");
        }
        setDirectory(newDirectory);
    }

    @Override
    public void changeOwner(IOwner newOwner) {
        if(newOwner == null){
            throw new IllegalArgumentException("Owner of file can't be null");
        }
        setOwner(newOwner);
    }

    @Override
    public void changeReadPermission() {

    }

    @Override
    public void changeWritePermission() {

    }


}
