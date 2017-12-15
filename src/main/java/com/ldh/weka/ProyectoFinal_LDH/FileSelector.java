<<<<<<< HEAD
package com.ldh.weka.ProyectoFinal_LDH;


import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

// TODO: Auto-generated Javadoc
/**
 * Seleccionar los ficheros.
 */
public class FileSelector{
    
    /**
     * Choose files.
     *
     * @return the file[]
     */
    public File[] chooseFiles(){
        JFileChooser chooser = null;
        File[] entradas = null;
        try{
            chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(true);
            chooser.setFileFilter(new FileNameExtensionFilter("ARFF","arff"));
            int retorno = chooser.showOpenDialog(null);
            
            if(retorno == JFileChooser.APPROVE_OPTION){
                entradas = chooser.getSelectedFiles();
            }
            return entradas;
        }finally{
            chooser = null;
            entradas = null;
        }
    }
    
    /**
     * Choose directory.
     *
     * @return the file
     */
    public File chooseDirectory(){
        JFileChooser chooser = null;
        File diretorio = null;
        try{
            chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int retorno = chooser.showOpenDialog(null);
            
            if(retorno == JFileChooser.APPROVE_OPTION){
                diretorio = chooser.getSelectedFile();
            }
            return diretorio;
        }finally{
            chooser = null;
            diretorio = null;
        }
    }
}
=======
package com.ldh.weka.ProyectoFinal_LDH;


import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *Seleccionar los ficheros
 * 
 */
public class FileSelector{
    public File[] chooseFiles(){
        JFileChooser chooser = null;
        File[] entradas = null;
        try{
            chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(true);
            chooser.setFileFilter(new FileNameExtensionFilter("ARFF","arff"));
            int retorno = chooser.showOpenDialog(null);
            
            if(retorno == JFileChooser.APPROVE_OPTION){
                entradas = chooser.getSelectedFiles();
            }
            return entradas;
        }finally{
            chooser = null;
            entradas = null;
        }
    }
    
    public File chooseDirectory(){
        JFileChooser chooser = null;
        File diretorio = null;
        try{
            chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int retorno = chooser.showOpenDialog(null);
            
            if(retorno == JFileChooser.APPROVE_OPTION){
                diretorio = chooser.getSelectedFile();
            }
            return diretorio;
        }finally{
            chooser = null;
            diretorio = null;
        }
    }
}
>>>>>>> refs/remotes/origin/master
