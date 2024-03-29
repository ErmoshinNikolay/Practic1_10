/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_10;

/**
 *
 * @author Erm
 */
public class Text {
    public static  checkWorkDirectory(String path,String dirName){
        File workDir = new Fille(path + "/" + dirName);
        if(workDir.exits()){
            return true;
        }else{
            return workDir.mkdir()
        }
    }
}
