/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ejb.ArchivoFacadeLocal;
import entity.Archivo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Juan Quishpe
 */
@ManagedBean(name = "BeanArchivo")
@RequestScoped
public class BeanArchivo {

    @EJB
    private ArchivoFacadeLocal managerArchivo;
    private Archivo archi;
    private List<Archivo> list;

     private UploadedFile files;
     private String destino;
    
    
    public BeanArchivo() {
    }

    @PostConstruct
    private void inicio() {
        list = managerArchivo.listarArchivos();

        archi = new Archivo();
        

    }

    public UploadedFile getFiles() {
        return files;
    }

    public void setFiles(UploadedFile files) {
        this.files = files;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
      
    }

     
    
    public ArchivoFacadeLocal getManagerArchivo() {
        return managerArchivo;
    }

    public void setManagerArchivo(ArchivoFacadeLocal managerArchivo) {
        this.managerArchivo = managerArchivo;
    }

    public Archivo getArchi() {
        return archi;
    }

    public void setArchi(Archivo archi) {
        this.archi = archi;
    }

    public List<Archivo> getList() {
        return list=managerArchivo.findAll();
    }

    public void setList(List<Archivo> list) {
        this.list = list;
    }


}
